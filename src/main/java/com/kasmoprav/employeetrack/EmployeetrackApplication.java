package com.kasmoprav.employeetrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kasmoprav.employeetrack")
public class EmployeetrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeetrackApplication.class, args);
	}

}
