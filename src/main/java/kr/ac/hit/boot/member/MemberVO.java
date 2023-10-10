package kr.ac.hit.boot.member;

import lombok.Data;

@Data
public class MemberVO {
    private String id;
    private String password;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
}
