package com.dsy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-11
 * @time 20:13
 */
@SpringBootApplication(scanBasePackages = {"com.dsy.order","com.dsy.sunshine.web"})
@MapperScan( basePackages = {"com.dsy.order.gateway.database"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }

}
