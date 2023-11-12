package seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    User user;
    User admin;

    @BeforeEach
    void setUp(){
        user = new User("Dima", "123", false);
        admin = new User("Admin", "admin", true);
    }

    @Test
    @DisplayName("Проверка аутентификации с валидными данными")
    void authenticateValid() {
        assertTrue(user.authenticate("Dima", "123"));
    }

    @Test
    @DisplayName("Проверка аутентификации с НЕвалидными данными")
    void authenticateInValid() {
        assertFalse(user.authenticate("Dima", "111"));
    }

    @Test
    @DisplayName("Проверка, что пользователь является администратором")
    void isAdminTrue() {
        assertTrue(admin.isAdmin);
    }

    @Test
    @DisplayName("Проверка, что пользователь НЕ является администратором")
    void isAdminFalse() {
        assertFalse(user.isAdmin);
    }
}