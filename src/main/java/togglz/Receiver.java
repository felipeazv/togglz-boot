package togglz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	@KafkaListener(topics = "kafka-test-1")
	public void receiver1(String message) {
		LOGGER.info("receiver1 received message='{}'", message);
	}
	@KafkaListener(topics = "kafka-test-1")
	public void receiver2(String message) {
		LOGGER.info("receiver2 received message='{}'", message);
	}
}