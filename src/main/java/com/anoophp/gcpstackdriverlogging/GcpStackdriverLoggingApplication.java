package com.anoophp.gcpstackdriverlogging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GcpStackdriverLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpStackdriverLoggingApplication.class, args);
	}

}

@RestController
@Slf4j
class Foo {

	@GetMapping("/foo")
	public String bar() {
		log.info("Test log");
		return "bar";
	}
}
