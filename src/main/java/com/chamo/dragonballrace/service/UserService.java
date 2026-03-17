package com.chamo.dragonballrace.service;

import com.chamo.dragonballrace.dto.UserRequestDTO;
import com.chamo.dragonballrace.dto.UserResponseDTO;
import com.chamo.dragonballrace.entity.UserEntity;
import com.chamo.dragonballrace.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDTO getUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "NO SE ENCONTRO EL USUARIO")
        );

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(id);
        userResponseDTO.setName(userEntity.getName());
        userResponseDTO.setSex(userEntity.getSex());
        userResponseDTO.setHobbies(userEntity.getHobbies());

        return userResponseDTO;
    }

    public UserResponseDTO saveUser(UserRequestDTO userRequestDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequestDTO.getName());
        userEntity.setSex(userRequestDTO.getSex());
        userEntity.setHobbies(userRequestDTO.getHobbies());
        userRepository.save(userEntity);

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(userEntity.getId());
        userResponseDTO.setName(userEntity.getName());
        userResponseDTO.setSex(userEntity.getSex());
        userResponseDTO.setHobbies(userEntity.getHobbies());

        return userResponseDTO;
    }
}
