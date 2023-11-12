package seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    User user;
    User admin;
    UserRepository repo;

    @BeforeEach
    void setUp() {
        user = new User("Dima", "123", false);
        admin = new User("Admin", "admin", true);
        repo = new UserRepository();
    }

    @Test
    @DisplayName("Проверка добавления в БД аутентифицированных пользователей")
    void addUserAuth() {
        user.authenticate("Dima", "123");
        repo.addUser(user);
        assertEquals(user, repo.getData().get(0));
    }

    @Test
    @DisplayName("Проверка добавления в БД НЕаутентифицированных пользователей")
    void addUserNoAuth() {
        repo.addUser(user);
        assertTrue(repo.getData().isEmpty());
    }

    @Test
    @DisplayName("Проверка поиска по имени")
    void findByName() {
        user.authenticate("Dima", "123");
        repo.addUser(user);
        assertTrue(repo.findByName("Dima"));
    }

    @Test
    void killUser() {
        user.authenticate("Dima", "123");
        admin.authenticate("Admin", "admin");
        repo.addUser(user);
        repo.addUser(admin);
        repo.killUser();
        assertEquals(admin, repo.getData().get(0));
    }

    @Test
    @DisplayName("Проверка получения списка пользователей из БД")
    void getData() {
        user.authenticate("Dima", "123");
        repo.addUser(user);
        assertEquals(user, repo.getData().get(0));
    }
}