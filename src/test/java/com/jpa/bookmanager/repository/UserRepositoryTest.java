package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest             // spring context를 로딩해서 test에 활용하겠다는 의미.
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {       // create, read, update, delete
        userRepository.save(new User());    // user를 생성해서 저장. (NoArgsConstructor로 들어감.)

        System.out.println(">>> " + userRepository.findAll());     // user 테이블에 있는 모든 데이터를 list 형태로 가져옴.
    }
}