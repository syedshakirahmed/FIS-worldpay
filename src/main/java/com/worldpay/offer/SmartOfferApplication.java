package com.worldpay.offer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableScheduling
public class SmartOfferApplication {

	public static void main(String[] args) {
		run(SmartOfferApplication.class, args);
	}

}
