package com.yilianjiaju.ymall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.yilianjiaju.ymall.mapper")
public class YmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(YmallApplication.class,args);
    }
}
