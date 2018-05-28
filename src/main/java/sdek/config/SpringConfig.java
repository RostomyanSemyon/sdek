package sdek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import sdek.dao.MyDao;
import sdek.dao.MyDaoImpl;
import sdek.service.UserService;
import sdek.service.UserServiceImpl;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/sdek");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public MyDao getMyDao(){
        return new MyDaoImpl();
    }

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }
}
