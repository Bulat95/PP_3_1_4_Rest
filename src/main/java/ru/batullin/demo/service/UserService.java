package ru.batullin.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.batullin.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    boolean addUser(User user);

    User getUserById(Long id);

    boolean updateUser(User user);

    boolean deleteUserById(Long id);

    List<User> getAllUsers();

    User loadUserByUsername (String name);
}
