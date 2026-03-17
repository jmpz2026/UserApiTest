package com.chamo.dragonballrace.controller;

import com.chamo.dragonballrace.dto.UserRequestDTO;
import com.chamo.dragonballrace.dto.UserResponseDTO;
import com.chamo.dragonballrace.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable Long id){
        UserResponseDTO response = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> saveUser(@RequestBody UserRequestDTO userRequestDTO){
        UserResponseDTO response = userService.saveUser(userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
