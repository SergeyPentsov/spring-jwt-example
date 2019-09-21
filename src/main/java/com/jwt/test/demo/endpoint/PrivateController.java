package com.jwt.test.demo.endpoint;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/private")
public class PrivateController {

    @GetMapping
    public String getMessage(Authentication authentication) {
        System.out.println(authentication.toString());
        return "Hello from private API controller";
    }
}