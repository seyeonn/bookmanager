package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {   // 많은 jpa 관련 메소드 지원 받음. 제네릭 < 엔티티 타입, pk키 타입 >

}
