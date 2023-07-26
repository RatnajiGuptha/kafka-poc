package com.spring.boot.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@KafkaListener(topics = "spring-kafka-publisher-1", groupId = "consumer-group-1")
	public void consume1(String message) {
		log.info("consumer1 Consume the message {}", message);
	}

	@KafkaListener(topics = "spring-kafka-publisher-1", groupId = "consumer-group-1")
	public void consume2(String message) {
		log.info("consumer2 Consume the message {}", message);
	}

	@KafkaListener(topics = "spring-kafka-publisher-1", groupId = "consumer-group-1")
	public void consume3(String message) {
		log.info("consumer3 Consume the message {}", message);
	}

	

}
