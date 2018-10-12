package com.userweb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@MapperScan("com.userweb.demo.mapper")//mybatis 映射接口扫描
@SpringBootApplication//=@Configuration ， @EnableAutoConfiguration 和 @ComponentScan
//@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

