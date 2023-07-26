package com.spring.boot.kafka.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagePublisher {

	@Autowired
	private KafkaTemplate<String, Object> template;

	public void sendMessage(String message) {
		CompletableFuture<SendResult<String, Object>> future = template.send("spring-kafka-publisher-1", message);
		future.whenComplete((res, ex) -> {
			if (ex == null) {

				System.out.println("Sent message --> " + message + " with offset --> "
						+ res.getRecordMetadata().offset() + " with partiton --> " + res.getRecordMetadata().partition());
			} else {
				System.out.println("unable to send message --> " + message + " due to -->" + ex.getMessage());
			}
		});
	}
}
