package kyocoolcool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SpringBootSunnyWebApplication
 * @Description Sunny WebSite後台
 * @Author Chris Chen
 * @Date 2019-08-19 16:39
 * @Version 1.0
 **/
//@MapperScan("kyocoolcool.dao.mapper")
@SpringBootApplication
public class SpringBootSunnyWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSunnyWebApplication.class, args);
    }
}