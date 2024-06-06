import 'C:\\intellij_idea_project_sem6\\kurs\\mslearn-react\\code\\0-starter\\my-app\\src\\design\\Review.css';
import { useState, useEffect } from "react";
import axios from 'axios';

function Review() {
    const [data,setData] = useState({
        name: '',
        text: ''
    })
    const [reviews,setReviews] = useState([]);
    const [name,setName] = useState('');
    const [text,setText] = useState('');
    const addNewReview = (e) => {
        e.preventDefault();
        const newReview = {
            name,
            text
        }
        console.log(newReview);
        const newData = {
            name: name,
            text: text
        }
        if (!(newData.name == '' || newData.text == '')) {
            axios.post("http://localhost:8080/addReview", newData)
                .then((response) => {
                    console.log(response);
                    fetchReviews();
                })
                .catch((error) => {
                    console.log(error)
                });
        }
        setName('')
        setText('')
    }

    async function fetchReviews() {
        const response = await axios.get('http://localhost:8080/getReviews');
        console.log(response.data)
        setReviews(response.data)
    }

    useEffect(() => {
        fetchReviews()
    },[])

    return (
      <div>
        <form className="form-review">
          <p><input value={name} onChange={e=>setName(e.target.value)} className="nameClient" type="text" placeholder="Имя клиента"/></p>
          <p><textarea value={text} onChange={e=>setText(e.target.value)} className="textReview" placeholder="Оставьте свой отзыв"/></p>
          <p><button onClick={addNewReview} className="button-newReview">Отправить</button></p>
        </form>
        <p className="text-addition">Другие отзывы</p>
        <div >
            {reviews.map(review =>
                <div className='post'>
                    <p className='post-name'>{review.name}</p>
                    <p className='post-role'>({review.role})</p>
                    <p className='post-text'>{review.text}</p>
                </div>
            )}
        </div>
      </div>
    );
}

export default Review;