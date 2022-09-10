package com.chatter.chatter;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.chatter.chatter.persistence.tables.messages.Message;
import com.chatter.chatter.persistence.tables.messages.MessageRepository;

@RestController
@RequestMapping(path = "/messages")
public class MessageController {
	
	@Autowired
	MessageRepository messageRepo;

	@GetMapping(path="/", produces = "application/json")
	public List<Message> getAllMessages() {
		return messageRepo.findAll();
	}

}
