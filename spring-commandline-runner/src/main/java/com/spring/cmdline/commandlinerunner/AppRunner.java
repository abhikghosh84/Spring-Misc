package com.spring.cmdline.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component //--> This is one of the ways to invoke runner method
public class AppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello! This is running from Application Runner Class");
	}

}
