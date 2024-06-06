package hotel_labs.lr3_1.repository;

import hotel_labs.lr3_1.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {
}
