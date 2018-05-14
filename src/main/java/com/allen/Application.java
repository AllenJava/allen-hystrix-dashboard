package com.allen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//注解开启hystrix监控面板
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
