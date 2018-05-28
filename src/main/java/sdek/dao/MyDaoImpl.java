package sdek.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import sdek.mapper.UserMapper;
import sdek.model.User;

import java.util.List;

/**
 * Created by Домашний ПК on 27.05.2018.
 */
public class MyDaoImpl implements MyDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM sdek";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO sdek (name) VALUE (?)";
        jdbcTemplate.update(sql, user.getName());
    }

    @Override
    public List<User> findByName(String name) {
        String sql = "SELECT * FROM sdek WHERE NAME LIKE '%" + name + "%'";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
