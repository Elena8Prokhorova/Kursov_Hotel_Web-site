package hotel_labs.lr3_1.controller;

import hotel_labs.lr3_1.model.Food;
import hotel_labs.lr3_1.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    private final FoodService foodService;
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getFoods")
    public List<Food> get() {
        return foodService.getFoods();
    }

    @PostMapping("/addFood")
    public Food addFood(@RequestBody Food food) {
        foodService.addFood(food);
        return food;
    }

    @DeleteMapping("/deleteFood")
    public void deleteFood(String id) {
        foodService.deleteFood(id);
    }

    @PutMapping("/updateFood")
    public Food updateFood(@RequestBody Food food) {
        foodService.updateFood(food);
        return food;
    }
}
