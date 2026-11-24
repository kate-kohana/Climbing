package com.kate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "routes")
public class Route {

    public enum RouteType {
        BOULDER, // Болдеринг (стикер)
        LEAD     // Трудность (карточка)
    }

    public enum RouteStatus {
        ACTIVE,  // Висит в зале
        REMOVED  // Скручена
    }

    public enum OverhangType {
        VERTICAL, // Вертикаль
        OVERHANG, // Нависание
        STEEP,    // Сильное нависание
        ROOF      // Потолок
    }

    @Id
    private String id;

    // Общие поля
    private RouteType type;
    private String color;          // Цвет зацепов / стикера (белый, жёлтый, зелёный, синий, красный, чёрный)
    private LocalDate setDate;     // Дата накрутки
    private String setterId;       // ID автора накрутки
    private String setterName;     // Имя накрутчика (для быстрого отображения в карточке)
    private List<String> photoUrls = new ArrayList<>(); // 1-3 ссылки на фото
    private RouteStatus status = RouteStatus.ACTIVE;

    // Поля для трудности (и опционально название для болдера)
    private String name;           // Название трассы
    private String grade;          // Категория (5a - 8a)
    private OverhangType overhang; // Уровень нависания
    private List<String> holdTypes = new ArrayList<>(); // Тип зацепов (полки, щипцы, моно, рельеф)

    public Route() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public RouteType getType() { return type; }
    public void setType(RouteType type) { this.type = type; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public LocalDate getSetDate() { return setDate; }
    public void setSetDate(LocalDate setDate) { this.setDate = setDate; }

    public String getSetterId() { return setterId; }
    public void setSetterId(String setterId) { this.setterId = setterId; }

    public String getSetterName() { return setterName; }
    public void setSetterName(String setterName) { this.setterName = setterName; }

    public List<String> getPhotoUrls() { return photoUrls; }
    public void setPhotoUrls(List<String> photoUrls) { this.photoUrls = photoUrls; }

    public RouteStatus getStatus() { return status; }
    public void setStatus(RouteStatus status) { this.status = status; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public OverhangType getOverhang() { return overhang; }
    public void setOverhang(OverhangType overhang) { this.overhang = overhang; }

    public List<String> getHoldTypes() { return holdTypes; }
    public void setHoldTypes(List<String> holdTypes) { this.holdTypes = holdTypes; }
}
