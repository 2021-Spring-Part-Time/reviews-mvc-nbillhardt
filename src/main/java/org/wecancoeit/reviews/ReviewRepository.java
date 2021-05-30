package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap();

    public ReviewRepository(){
        Review review1 = new Review(1L, "Stone Cold Steve Austin", "wrestling", "this is the review for  review1");
        Review review2 = new Review(2L, "Jon Moxley / Dean Ambrose", "wrestling", "this is the review for  mock2");
        Review review3 = new Review(3L, "Shawn Michaels", "wrestling", "this is the review for  mock3");

        reviewsList.put(review1.getId(), review1);
        reviewsList.put(review2.getId(), review2);
        reviewsList.put(review3.getId(), review3);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
            for(Review review: reviewsToAdd){
                reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
