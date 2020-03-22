
package com.spring.cmdline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

@SpringBootApplication
public class SpringCommandlineRunnerApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringCommandlineRunnerApplication.class, args);
	}
	
	

}
