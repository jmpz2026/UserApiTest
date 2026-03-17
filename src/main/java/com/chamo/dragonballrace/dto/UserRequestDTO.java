package com.chamo.dragonballrace.dto;

import com.chamo.dragonballrace.enums.UserSexEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRequestDTO {

    private String name;
    private UserSexEnum sex;
    private List<String> hobbies;
}
