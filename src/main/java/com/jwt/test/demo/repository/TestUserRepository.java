package com.jwt.test.demo.repository;

import com.jwt.test.demo.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserRepository extends JpaRepository<TestUser, Long> {

    TestUser findByUsername(String username);
}
