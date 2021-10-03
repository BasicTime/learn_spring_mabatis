package cn.ms22.learn_spring_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.ms22.learn_spring_mybatis.mapper")
@EnableTransactionManagement
public class LearnSpringMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnSpringMybatisApplication.class, args);
    }
}
