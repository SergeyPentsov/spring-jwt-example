package com.jwt.test.demo.endpoint;


import com.jwt.test.demo.entity.TestUser;
import com.jwt.test.demo.repository.TestUserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final TestUserRepository userRepository;

    public RegistrationController(TestUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping("/registr")
    public void registr(@RequestBody TestUser testUser) {
        userRepository.save(testUser);
    }
}
