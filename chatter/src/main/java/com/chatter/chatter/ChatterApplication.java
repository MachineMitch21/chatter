package com.chatter.chatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.chatter.chatter.persistence.tables.messages.MessageRepository;
import com.chatter.chatter.persistence.tables.messages.Message;

@SpringBootApplication
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = "com.chatter.chatter.persistence.tables")
public class ChatterApplication implements CommandLineRunner {

	@Autowired
	MessageRepository messageRepo;

	public void createMessages() {
		messageRepo.deleteAll();
		messageRepo.save(new Message("Hey, this is my first message"));
	}

	public void showAllMessages() {
		messageRepo.findAll().forEach(msg -> {
			System.out.println(msg);
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(ChatterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createMessages();
		showAllMessages();
	}

}
