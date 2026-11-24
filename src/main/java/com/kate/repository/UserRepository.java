package com.kate.repository;

import com.kate.model.User;
import com.kate.model.User.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    // Найти пользователя по email (для входа на сайт)
    Optional<User> findByEmail(String email);

    // Проверить, занят ли email при регистрации
    boolean existsByEmail(String email);

    // Найти всех пользователей с определённой ролью (например, всех накрутчиков)
    List<User> findByRole(Role role);
}
