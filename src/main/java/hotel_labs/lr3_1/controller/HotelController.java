package hotel_labs.lr3_1.controller;

import hotel_labs.lr3_1.model.HotelRoom;
import hotel_labs.lr3_1.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HotelController {
    private final HotelService hotelService;
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/")
    public List<HotelRoom> get() {
        return hotelService.getHotelRooms();
    }

    @GetMapping("/findRoomById")
    public Optional<HotelRoom> getById(String id) {
        return hotelService.findHotelRoomById(id);
    }

    @PostMapping("/addHotelRoom")
    public HotelRoom addHotelRoom(@RequestBody HotelRoom hotelRoom) {
        hotelService.addHotelRoom(hotelRoom);
        return hotelRoom;
    }

    @DeleteMapping("/deleteRoom")
    public void deleteHotelRoom(String id) {
        hotelService.deleteHotelRoom(id);
    }

    @PutMapping("/updateRoom")
    public HotelRoom updateHotelRoom(@RequestBody HotelRoom hotelRoom) {
        hotelService.updateHotelRoom(hotelRoom);
        return hotelRoom;
    }
}
