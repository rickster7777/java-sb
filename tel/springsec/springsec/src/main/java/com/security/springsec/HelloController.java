package com.security.springsec;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/gem")
    public String greet(HttpSession session) {
        String sessionId = session.getId();
        return "Hello Spring Security! Gem (Session ID: " + sessionId + ")";
    }

    @GetMapping("/")
    public String meet(HttpServletRequest request) {
        return "Hello Spring Security! (Session ID: " + request.getSession().getId() + ")";
    }
}