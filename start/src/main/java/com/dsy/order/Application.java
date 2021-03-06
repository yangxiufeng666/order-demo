package com.dsy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-11
 * @time 20:13
 */
@SpringBootApplication
@MapperScan( basePackages = {"com.dsy.order.gateway.database"})
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }

}
