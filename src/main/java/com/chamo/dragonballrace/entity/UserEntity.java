package com.chamo.dragonballrace.entity;

import com.chamo.dragonballrace.enums.UserHobbyEnum;
import com.chamo.dragonballrace.enums.UserSexEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex", nullable = false)
    private UserSexEnum sex;

    @Column(name = "hobbies", nullable = false)
    private List<UserHobbyEnum> hobbies;
}
