package hotel_labs.lr3_1.service;

import hotel_labs.lr3_1.model.Food;
import hotel_labs.lr3_1.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getFoods() {
        return foodRepository.findAll();
    }

    public void addFood(Food room) {
        foodRepository.save(room);
    }

    public void deleteFood(String id) {
        foodRepository.deleteById(id);
    }

    public void updateFood(Food hotelRoom) {
        foodRepository.save(hotelRoom);
    }
}
