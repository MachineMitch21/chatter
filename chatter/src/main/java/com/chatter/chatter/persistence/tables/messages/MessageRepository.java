package com.chatter.chatter.persistence.tables.messages;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MessageRepository extends MongoRepository<Message, String> {

	@Query("{id: '?0'")
	public Message findMessageById(Long id);

}
