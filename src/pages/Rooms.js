import './Rooms.css';
import axios from 'axios';
import React, { useState, useEffect } from "react";

export default function Rooms() {
    const [rooms,setRooms] = useState([]);
    async function fetchRooms() {
        const response = await axios.get('http://localhost:8080/');
        console.log(response.data)
        setRooms(response.data)
    }

    useEffect(() => {
        fetchRooms()
    },[])

    return(
        <div>
            <div className='App-home'>
                <br/><p/>
                <h3 class="App-main-head" align="center">Бизнес-отель "Мрамора" - Бронирование номеров</h3>

                <div>
                    {rooms.map(room =>
                        <div className='room'>
                            <div>
                                <p className='room-name'>{room.name}</p>
                                <img className='room-img' alt="foto-room" src={room.img}/>
                                <p className='room-text'>{room.description}</p>
                            </div>
                        </div>
                    )}
                </div>
                <br/>
                <div className='App-footer-two'>
                    <br/>
                    <p className='text-footer'>Забронируйте свой отпуск! ; )</p>
                    <a className="App-link" href="mailto:prokhorova.elena2003@mail.ru">
                        prokhorova.elena2003@mail.ru
                    </a>
                    <p className="App-link"> +7(924) 402-43-96</p>
                    <p className="App-link"> 70-00-05</p>
                    <br/>
                </div>
            </div>
        </div>
    );
}