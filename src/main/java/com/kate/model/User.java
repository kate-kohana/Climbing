package com.kate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
public class User {

    public enum Role {
        CLIMBER,     // Скалолаз
        ROUTESETTER, // Накрутчик
        ADMIN        // Администратор
    }

    @Id
    private String id;

    @Indexed(unique = true)
    private String email;

    private String passwordHash;
    private String fullName;
    private Role role = Role.CLIMBER;

    // Для соответствия Закону РБ «О персональных данных»
    private boolean personalDataConsent;
    private LocalDateTime consentDate;

    public User() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public boolean isPersonalDataConsent() { return personalDataConsent; }
    public void setPersonalDataConsent(boolean personalDataConsent) { this.personalDataConsent = personalDataConsent; }

    public LocalDateTime getConsentDate() { return consentDate; }
    public void setConsentDate(LocalDateTime consentDate) { this.consentDate = consentDate; }
}
