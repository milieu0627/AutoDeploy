package com.autoDeploy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.autoDeploy.dao")
public class AutoDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoDeployApplication.class, args);
	}
}
