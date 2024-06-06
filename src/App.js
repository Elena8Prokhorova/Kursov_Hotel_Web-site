import logo from './resources/hotel-logo.jpg';
import './App.css';

import Home from './pages/Home.js';
import Rooms from './pages/Rooms.js';
import Restaurant from './pages/Restaurant.js';

import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link
} from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <div className='App-head'>
            <p/>
            <img className="logo" alt="logo hotel" src={logo}/>
            <p/>
        </div>
        <br/>
        <div className="App-links">
            <p/>
            <Link to="/">Главная страница</Link> <p/>
            <Link to="/rooms">Просмотр номеров</Link> <p/>
            <Link to="/restaurant">Ресторан "Мрамора"</Link> <p/>
        </div>
        <div className='nameHotel'>
            <p>"Мрамора"</p>
        </div>
        <Routes>
            <Route path="/" element={<Home/>} />
            <Route path="/rooms" element={<Rooms/>} />
            <Route path="/restaurant" element={<Restaurant/>} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
