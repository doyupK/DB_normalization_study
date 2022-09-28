package com.supercarmarket_test.dev.repository;


import com.supercarmarket_test.dev.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
