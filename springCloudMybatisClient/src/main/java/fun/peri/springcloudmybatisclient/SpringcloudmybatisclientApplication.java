package fun.peri.springcloudmybatisclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = "fun.peri.springcloudmybatisclient.*")
public class SpringcloudmybatisclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudmybatisclientApplication.class, args);
    }
}
