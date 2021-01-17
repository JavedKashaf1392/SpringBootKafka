package in.javed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.javed.producer.service.ProducerService;
import in.javed.store.MessageStore;

@RestController
@RequestMapping("/kafkaservice")
public class KafkaRestController {
	
	@Autowired
	private ProducerService producer;
	
	@Autowired
	private MessageStore store;
	
	
	//send to kafka
	@GetMapping("/send")
	public String sendtoKafka(@RequestParam String message) {
		
		producer.sendtoKafka(message);
		return "SENT";
		
	}
	
	//read all message
	@GetMapping("/all")
	public String viewMessage() {
		return store.readAll();
		
	}

}
