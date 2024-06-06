package hotel_labs.lr3_1.controller;

import hotel_labs.lr3_1.model.Review;
import hotel_labs.lr3_1.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getReviews")
    public List<Review> getReviews() {
        return reviewService.getReviews();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addReview")
    public Review addReview(@RequestBody Review review) {
        reviewService.addReview(review);
        return review;
    }

    @DeleteMapping("/deleteReview")
    public void deleteReview(String id) {
        reviewService.deleteReview(id);
    }

    @PutMapping("/updateReview")
    public Review updateReview(@RequestBody Review review) {
        reviewService.updateReview(review);
        return review;
    }
}
