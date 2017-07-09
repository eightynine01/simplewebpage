package univth.portfolio.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by TaeHwan
 * 2017. 7. 9. PM 3:46
 */
@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() throws SQLException {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/simpleweb?useSSL=true&useUnicode=yes&characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("a0000001");
        return dataSource;
    }
}
