package in.javed.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import in.javed.store.MessageStore;

@Component
public class ConsumerService {
	
	@Autowired
	private MessageStore ms;

	@KafkaListener(topics = "${my.app.topic-name}",
			groupId = "groupId")
	public void readDataFromKafka(String message) {
		System.out.println("Executed For"+message);
		ms.addData(message);
	}
	
}
