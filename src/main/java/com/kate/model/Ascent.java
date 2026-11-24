package com.kate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "ascents")
public class Ascent {

    public enum AscentStyle {
        ONSIGHT,  // С первой попытки без подсказок
        FLASH,    // С первой попытки с подсказками
        REDPOINT  // С последующих попыток
    }

    @Id
    private String id;

    private String userId;
    private String routeId;
    private LocalDate date;
    private boolean completed;   // true = «Пролез», false = «Не пролез»
    private AscentStyle style;   // Заполняется, если completed == true

    public Ascent() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getRouteId() { return routeId; }
    public void setRouteId(String routeId) { this.routeId = routeId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    public AscentStyle getStyle() { return style; }
    public void setStyle(AscentStyle style) { this.style = style; }
}
