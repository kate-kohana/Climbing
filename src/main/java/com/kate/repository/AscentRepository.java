package com.kate.repository;

import com.kate.model.Ascent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AscentRepository extends MongoRepository<Ascent, String> {

    // Найти все пролазы и попытки конкретного скалолаза (для профиля и рекомендаций)
    List<Ascent> findByUserId(String userId);

    // Найти все отметки по конкретной трассе (для статистики админа)
    List<Ascent> findByRouteId(String routeId);

    // Найти только успешные пролазы пользователя
    List<Ascent> findByUserIdAndCompletedTrue(String userId);
}
