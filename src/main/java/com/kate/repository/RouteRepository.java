package com.kate.repository;

import com.kate.model.Route;
import com.kate.model.Route.RouteStatus;
import com.kate.model.Route.RouteType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RouteRepository extends MongoRepository<Route, String> {

    // Найти все активные или снятые трассы
    List<Route> findByStatus(RouteStatus status);

    // Найти трассы по типу (болдер или трудность) и статусу
    List<Route> findByTypeAndStatus(RouteType type, RouteStatus status);

    // Найти трассы конкретного накрутчика (для статистики и профиля)
    List<Route> findBySetterId(String setterId);

    // Найти трассы по цвету зацепов/стикера
    List<Route> findByColorAndStatus(String color, RouteStatus status);
}
