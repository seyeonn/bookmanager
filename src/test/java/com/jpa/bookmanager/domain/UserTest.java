package com.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("asy@fc.com");
        user.setName("seco");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null,"seco", "asy@fc.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("seco", "asy@fc.com");
        User user3 = User.builder()
                .name("seco")
                .email("asy@fc.com")
                .build();

        System.out.println(">>> " + user.toString());

    }
}