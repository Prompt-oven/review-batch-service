package com.promptoven.reviewBatchService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReviewBatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewBatchServiceApplication.class, args);
	}

}
