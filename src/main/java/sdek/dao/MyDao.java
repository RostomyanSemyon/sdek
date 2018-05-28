package sdek.dao;

import sdek.model.User;

import java.util.List;

/**
 * Created by Домашний ПК on 27.05.2018.
 */
public interface MyDao {

    List<User> findAll();

    void addUser(User user);

    List<User> findByName(String name);
}
