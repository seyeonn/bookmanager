package com.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

//@Getter              이렇게 lombok을 설정해주면 컴파일할 때 DeLombok이라는 절차를 통해서 getter/setter를 자동으로 생성해준다.
//@Setter
//@ToString
@NoArgsConstructor        // 인자 없이 생성하는 생성자 , 거의 필수적으로 생성
@AllArgsConstructor       // 객체가 가지고 있는 모든 필드들을 인자로 받아서 생성하는 생성자
@RequiredArgsConstructor  // 꼭 필요한 인자만을 이용해서 생성하는 생성자
//@EqualsAndHashCode         자바에서 기본적으로 객체의 동등성을 비교하기 위해서 equals()와 hashCode()를 오버라이딩할 것을 권고하고 있다.
@Data                     // @Getter, @Setter, @ToString, @EqualsAndHashCode 포함하고 있음.
@Builder                  // AllArgsConstructor와 비슷하게 객체를 생성하고 필드값을 주입해주는데 빌더의 형식을 가지고 제공해준다.
@Entity                   // 객체 생성
public class User {
    @Id                  // primary key
    @GeneratedValue      // 순차적으로 데이터 증가시킴.
    private Long id;

    @NonNull              // 필수 지정값
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;    // 생성된 시간과 수정된 시간은 일반적으로 jpa 도메인 객체에는 포함되어 있다.

    private LocalDateTime updatedAt;    // 데이터베이스의 데이터가 언제 수정되는지 생성되는지 관리하기 위해 필요.

/*    @Override
    public String toString() {
        return getClass().getName() +
                " : " +
                "name = " + name +
                ", email = " + email +
                ", createdAt = " + createdAt +
                ", updatedAt = " + updatedAt;
    }*/
}
