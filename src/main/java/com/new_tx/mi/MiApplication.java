package com.new_tx.mi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.new_tx.mi.Dao")
public class MiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiApplication.class, args);
    }

}
