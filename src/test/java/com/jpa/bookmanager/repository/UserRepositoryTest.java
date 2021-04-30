package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import com.jpa.bookmanager.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest             // spring context를 로딩해서 test에 활용하겠다는 의미.
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {       // create, read, update, delete
        User user = userRepository.findById(1L).orElse(null);
        System.out.println(user);
        // User user = userRepository.getOne(1L);

        /* User user1 = new User("jack", "jack@naver.com");
        User user2 = new User("steve", "steve@naver.com");

        userRepository.saveAll(Lists.newArrayList(user1, user2));

        List<User> users = userRepository.findAll();

        users.forEach(System.out::println); */
        // List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));  id가 1,3,5인 데이터 조회.
        // List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));  이름 정렬
        // userRepository.save(new User());     user를 생성해서 저장. (NoArgsConstructor로 들어감.)
        // userRepository.findAll().forEach(System.out::println);
        // System.out.println(">>> " + userRepository.findAll());      user 테이블에 있는 모든 데이터를 list 형태로 가져옴.
    }

}