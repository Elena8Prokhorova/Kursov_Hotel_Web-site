package hotel_labs.lr3_1.service;

import hotel_labs.lr3_1.model.Review;
import hotel_labs.lr3_1.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    public void addReview(Review review) {
        if (review.getRole()==null || !review.getRole().equals("админ")) {
            review.setRole("клиент");
        }
        reviewRepository.save(review);
    }

    public void deleteReview(String id) {
        reviewRepository.deleteById(id);
    }

    public void updateReview(Review review) {
        reviewRepository.save(review);
    }
}
