package com.kate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    private String routeId;
    private String userId;
    private String authorName;      // Имя скалолаза для вывода в списке отзывов
    private LocalDateTime createdAt = LocalDateTime.now();

    private String text;            // Текст отзыва (до 500 символов)
    private int rating;             // Оценка от 1 до 5
    private String cruxDescription; // Отметка «ключевой момент» (описание сложного места)

    public Review() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getRouteId() { return routeId; }
    public void setRouteId(String routeId) { this.routeId = routeId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getCruxDescription() { return cruxDescription; }
    public void setCruxDescription(String cruxDescription) { this.cruxDescription = cruxDescription; }
}
