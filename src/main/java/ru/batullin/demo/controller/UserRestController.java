package ru.batullin.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.batullin.demo.model.User;
import ru.batullin.demo.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("api/")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<User> getInfoCurrentUser(Principal principal) {
        return new ResponseEntity<>(userService.loadUserByUsername(principal.getName()), HttpStatus.OK); // 200
    }
}
