package net.javier.offlineapp;

import net.javier.offlineapp.data.Payment;
import net.javier.offlineapp.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class OfflineappApplication  {

	private static final Logger log = LoggerFactory.getLogger(OfflineappApplication.class);

	@Autowired
	private PaymentsRepository repository;

	@Autowired
	private PaymentService paymentService;

	public static void main(String[] args) {

		SpringApplication.run(OfflineappApplication.class, args);

	}

	@KafkaListener(
			topics = "offline",
			groupId="mygroup",
			containerFactory="paymentKafkaListenerContainerFactory")
	void listener(Payment payment) {
		log.info("Listener [{}]", payment.toString());
		paymentService.insert(payment);
	}

	/**
	@KafkaListener(topics = "offline", groupId = "${message.group.name:mygroup}")
	public void listen(@Payload Payment data,
					   @Headers MessageHeaders headers) {
		log.info("received data='{}'", data.toString());
		paymentService.insert(data);

		headers.keySet().forEach(key -> {
			LOG.info("{}: {}", key, headers.get(key));
		});
	}


	@Override
	public void run(String... args) {

		log.info("StartApplication...");


		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

	}*/

}
