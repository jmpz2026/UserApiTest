package com.chamo.dragonballrace.dto;

import com.chamo.dragonballrace.enums.UserHobbyEnum;
import com.chamo.dragonballrace.enums.UserSexEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDTO {

    private Long id;
    private String name;
    private UserSexEnum sex;
    private List<UserHobbyEnum> hobbies;
}
