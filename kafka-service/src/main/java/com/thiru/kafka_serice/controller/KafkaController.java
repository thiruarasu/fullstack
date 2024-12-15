package com.thiru.kafka_serice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/{message}")
	public String publish(@PathVariable("message") String message)
	{
		kafkaTemplate.send("hellowTopic", message);
		return "Message Published "+message;
	}

}
