package net.javier.offlineapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OfflineappApplication {

	private static final Logger log = LoggerFactory.getLogger(OfflineappApplication.class);

	@Autowired
	private PaymentsRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(OfflineappApplication.class, args);

	}


	@Override
	public void run(String... args) {

		log.info("StartApplication...");


		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));
		
	}
}
