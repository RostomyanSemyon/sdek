package sdek.service;

import sdek.model.User;

import java.util.List;

/**
 * Created by Домашний ПК on 27.05.2018.
 */
public interface UserService {
    List<User> findAll();

    List<User> findByName(String name);

    void addUser(User user);
}
