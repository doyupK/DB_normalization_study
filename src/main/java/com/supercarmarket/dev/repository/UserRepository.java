package com.supercarmarket.dev.repository;


import com.supercarmarket.dev.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
