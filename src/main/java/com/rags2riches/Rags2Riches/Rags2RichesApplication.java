package com.rags2riches.Rags2Riches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Rags2RichesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rags2RichesApplication.class, args);
	}

}
