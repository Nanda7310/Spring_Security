package com.nandu.springsecurity.repo;

import com.nandu.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
