package com.aitest.aitestmini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.aitest.aitestmini.dao")
@SpringBootApplication
public class WynApplication {

    public static void main(String[] args) {
        SpringApplication.run(WynApplication.class, args);
    }

}
