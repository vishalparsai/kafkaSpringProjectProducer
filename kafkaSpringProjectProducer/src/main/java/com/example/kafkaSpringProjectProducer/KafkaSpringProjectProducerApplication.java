package com.example.kafkaSpringProjectProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KafkaSpringProjectProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSpringProjectProducerApplication.class, args);
	}

}
