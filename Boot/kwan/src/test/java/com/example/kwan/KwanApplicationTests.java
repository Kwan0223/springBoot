package com.example.kwan;

//import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class KwanApplicationTests {
	public static void main(String[] args) {
//		SpringApplication.run(KwanApplicationTests.class, args);
		SpringApplication application = new SpringApplication(KwanApplicationTests.class);
		application.run(args);

	}
}
