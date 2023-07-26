package com.spring.boot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaPublisher {

	@Bean
	public NewTopic createTopic() {
		return new NewTopic("spring-kafka-publisher-1", 5, (short) 1);
	}
}
