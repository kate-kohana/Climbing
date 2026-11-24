package com.kate.repository;

import com.kate.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {

    // Получить все отзывы для карточки конкретной трассы
    List<Review> findByRouteId(String routeId);

    // Получить все отзывы, которые оставил конкретный пользователь
    List<Review> findByUserId(String userId);
}
