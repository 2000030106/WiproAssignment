package com.KafkaUberProducer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.KafkaUberProducer.entity.RideDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RideProducerService {

	 @Value("${wiproapp.topic.name}")
	    private String topicName;
	 
	 private final KafkaTemplate<String, String> kafkaTemplate;
	    
	    private final ObjectMapper objectMapper = new ObjectMapper();

	    public RideProducerService(KafkaTemplate<String, String> kafkaTemplate)
	    {
	        this.kafkaTemplate = kafkaTemplate;
	    }

	    public void sendMessage(RideDTO ride) throws Exception {
	        String jsonMessage = objectMapper.writeValueAsString(ride);
	        kafkaTemplate.send(topicName, jsonMessage);
	    }
	
	
}
