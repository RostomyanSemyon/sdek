package sdek.mapper;

import org.springframework.jdbc.core.RowMapper;
import sdek.model.User;

import javax.jws.soap.SOAPBinding;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Домашний ПК on 27.05.2018.
 */
public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        return user;
    }
}
