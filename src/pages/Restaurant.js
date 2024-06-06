import './Restaurant.css';
import axios from 'axios';
import React, { useState, useEffect } from "react";

export default function Restaurant() {
    const [orders,setOrders] = useState("");
    const [summa,setSumma] = useState(0);
    const [foods,setFoods] = useState([]);

    async function fetchFoods() {
        const response = await axios.get('http://localhost:8080/getFoods');
        console.log(response.data);
        setFoods(response.data);
    }
    useEffect(() => {
        fetchFoods()
    },[])

    function getRandomInt(max) {
        return Math.floor(Math.random() * max);
    }
    const [timeNow,setTimeNow] = useState(getRandomInt(10000));

    const addNewOrder = (e) => {
        e.preventDefault();
        const newOrder = {
            idOrder: timeNow.toString(),
            list: orders,
            price: summa
        }
        if (newOrder.list !== "" && newOrder.price !== 0) {
            axios.post('http://localhost:8080/addOrder',newOrder)
                .then((response) => {
                    console.log(response);
                })
                .catch((error) => {
                    console.log(error)
                })
        }
        document.location.reload();
    }

    return(
        <div className='App-restaurant'>
            <div>
                <br/><p/><br/>
                <h3 class="App-main-restaurant" align="center">Бизнес-отель "Мрамора" - Ресторан "Мрамора"</h3>
                <p className="restaurant-text">Ваш заказ №{timeNow}, обратитесь по номеру 70-00-05 для уточнения заказа</p>
                <p className="restaurant-head">Заказ:</p>
                <p className="restaurant-text">{orders}</p>
                <p className="restaurant-head">Итоговая сумма:</p>
                <p className="restaurant-text">{summa} руб.</p>
                <button className="restaurant-button" onClick={addNewOrder}>Собрать заказ</button>
            </div>
            <div>
                {foods.map(food =>
                    <div className='food'>
                        <div>
                            <a className='food-a' href={food.link}>
                                <img className="food-img" alt="food" src={food.img}/>
                                <h4 className='food-name'>{food.name}</h4>
                            </a>
                            <p className='food-text'>{food.description}</p>
                            <p className='food-price'>{food.price} руб.</p>
                            <button onClick={() => {
                                setOrders(orders+"_____"+food.name);
                                setSumma(summa+food.price);
                            }}>Добавить в заказ</button>
                        </div>
                    </div>
                )}
            </div>
            <p/>
            <div className='App-footer-two'>
                <br />
                <p className='text-footer'>Забронируйте свой отпуск! ; )</p>
                <a className="App-link" href="mailto:prokhorova.elena2003@mail.ru">
                    prokhorova.elena2003@mail.ru
                </a>
                <p className="App-link"> +7(924) 402-43-96</p>
                <p className="App-link"> 70-00-05</p>
                <br />
            </div>
        </div>
    );
}