package hotel_labs.lr3_1.service;

import hotel_labs.lr3_1.model.HotelRoom;
import hotel_labs.lr3_1.repository.HotelRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    private final HotelRoomRepository hotelRoomRepository;
    public HotelService(HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public List<HotelRoom> getHotelRooms() {
        return hotelRoomRepository.findAll();
    }

    public void addHotelRoom(HotelRoom room) {
        hotelRoomRepository.save(room);
    }

    public Optional<HotelRoom> findHotelRoomById(String id) {
        return hotelRoomRepository.findById(id);
    }

    public void deleteHotelRoom(String id) {
        hotelRoomRepository.deleteById(id);
    }

    public void updateHotelRoom(HotelRoom hotelRoom) {
        hotelRoomRepository.save(hotelRoom);
    }
}
