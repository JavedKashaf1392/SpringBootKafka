package in.javed.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	@Value("${my.app.topic-name}")
	private String topic;
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void sendtoKafka(String message) {
		template.send(topic,message);
		
	}

}
