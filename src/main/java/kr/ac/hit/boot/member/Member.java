package kr.ac.hit.boot.member;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor// 매개변수가 아무것도 없는 생성자를 만들어줌
//@Table(name = "member_join")
public class Member {
    @Id // primary key
    private String id;
    private String password;
    private String name;
    private String email;
    private String address;
//    @Column(name = "telephone_number")
    private String phoneNumber;
}
