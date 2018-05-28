package sdek.service;

import org.springframework.beans.factory.annotation.Autowired;
import sdek.dao.MyDao;
import sdek.model.User;

import java.util.List;

/**
 * Created by Домашний ПК on 27.05.2018.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private MyDao myDao;

    @Override
    public List<User> findAll(){
        return myDao.findAll();
    }

    @Override
    public List<User> findByName(String name) {
        return myDao.findByName(name);
    }

    @Override
    public void addUser(User user) {
        myDao.addUser(user);
    }
}
