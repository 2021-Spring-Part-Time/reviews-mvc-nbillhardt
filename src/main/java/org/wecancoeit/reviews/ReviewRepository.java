package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap();

    public ReviewRepository() {
        Review review1 = new Review(1L, "Cats", "/images/cats.jpg", "Animal", "The cats I have had over the years have lived anywhere from 8 to 15 years. Some friends have had cats live 15 to 20 years. Cats have pros and cons to owning them. Some of the pros are you don't have to take them outside. Pretty easy to take care of. Can be playful and loving. Some of the cons to owning cats are they like to scratch both you and everything else. The cat box can start to smell if not taken care of properly. Have a tendency to get sick sometimes.");
        Review review2 = new Review(2L, "Dogs", "/images/dogs.jpg", "Animal", "The dogs I have had over the years have lived for 10 to 14 years. Some dogs have lived 15 to 20 years. They have pros and cons just like all animals. Some of the pros are they are protective, playful, and loyal. Some of the cons are you have to take them outside to use the bathroom and clean up after them. Depending on size and breed good to have a house and a yard.");
        Review review3 = new Review(3L, "Reptiles", "/images/reptile.jpg", "Animal", "Having a reptile is pretty cool. They are generally kept in cages and brought out to roam when owners are around. Depending on the type of reptile you have to clean the cage sometimes 2 or 3 times a week. Some eat vegetables, crickets, or small rodents.");

        reviewsList.put(review1.getId(), review1);
        reviewsList.put(review2.getId(), review2);
        reviewsList.put(review3.getId(), review3);
    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
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
