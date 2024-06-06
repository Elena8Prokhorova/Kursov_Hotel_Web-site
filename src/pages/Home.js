import './Home.css';
import logo from 'C:\\intellij_idea_project_sem6\\kurs\\mslearn-react\\code\\0-starter\\my-app\\src\\resources\\hotel-logo.jpg';
import Reviews from 'C:\\intellij_idea_project_sem6\\kurs\\mslearn-react\\code\\0-starter\\my-app\\src\\structure\\ListReviews.js';

export default function Home() {
    return (
      <div>
        <div className='App-home'>
            <br/><p/>
            <img className="App-logoHotel" alt="logo hotel" src={logo}/>
            <br/>
            <h3 class="App-main-head" align="center">Бизнес-отель "Мрамора"</h3>
            <p>"Мрамора" - это новое слово среди отелей! Только у нас Вы можете выбрать
            удобные для Вас дату и время заселения и выезда, не переплачивая и не ожидая!
            <br/>Бронирование номера не ограничивается датой и количеством человек. Выберите всё,
            что Вам необходимо для отличного отдыха!</p>
            <p>Наш отель работает уже порядка 7 лет и до сих пор остается признанным одним из лучших отелей
            нашего региона!
            <br/>Удобное месторасположение, домашняя атмосфера, большое разнообразие услуг
             и демократичные цены - всё, <br/>чтобы Ваш отдых запомнился Вам только с хорошей стороны!</p>
            <p>Ищите нас по адресу: г.Хабаровск, ул. Амурский б-р, 46а.
            <br/>В шаговой доступности имеются несколько ТЦ, спортивный комплекс, площадки для различных
            мероприятий, кинотеатры, театры, кафе и рестораны фьюжн- и конкретной кухни!</p>
            <p>Оцените также и услуги, предоставляемые нашим отелем!<br/>
            <a href="https://hotelequator.ru/services">Услуги отеля "Мрамора"</a></p>
            <br/><p/><br/>
        </div>
        <div className='App-footer'>
            <h3 className='review'>Отзывы - узнайте побольше о нас от наших клиентов и поделитесь своим мнением!</h3>
            <br/><p/><br/>
            <Reviews />
        </div>
      </div>
    );
}