package com.amritesh.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

	@Bean
	public NewTopic topic() {
		return new NewTopic("amritesh-demo-topic8", 3, (short)1);
	}
	
}
