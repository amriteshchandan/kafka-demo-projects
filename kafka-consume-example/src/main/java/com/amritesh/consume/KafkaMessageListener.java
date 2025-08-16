package com.amritesh.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.amritesh.dto.Customer;

@Service
public class KafkaMessageListener {

	private Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);	
	
//	@KafkaListener(topics = "amritesh-demo-topic6", groupId = "group-6")
//	public void consume1(String message) {
//		logger.info("consumer1 consumed the message {}", message);
//	}
//	
//	@KafkaListener(topics = "amritesh-demo-topic6", groupId = "group-6")
//	public void consume2(String message) {
//		logger.info("consumer2 consumed the message {}", message);
//	}
//	
//	@KafkaListener(topics = "amritesh-demo-topic6", groupId = "group-6")
//	public void consume3(String message) {
//		logger.info("consumer3 consumed the message {}", message);
//	}
//	
//	@KafkaListener(topics = "amritesh-demo-topic6", groupId = "group-6")
//	public void consume4(String message) {
//		logger.info("consumer4 consumed the message {}", message);
//	}
	
//	@RetryableTopic(exclude = {IndexOutOfBoundsException.class, RuntimeException.class})
	@KafkaListener(topics = "amritesh-demo-topic8", groupId = "group-8")
	public void consume5(Customer customer) {
		logger.info("consumer5 consumed the message {}", customer.toString());
	}
}
