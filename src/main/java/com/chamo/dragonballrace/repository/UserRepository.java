package com.chamo.dragonballrace.repository;

import com.chamo.dragonballrace.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
