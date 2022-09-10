package com.chatter.chatter.persistence.tables.messages;

import org.springframework.data.mongodb.core.mapping.Document;

import com.chatter.chatter.persistence.tables.AbstractBaseTable;

@Document(collection = "message")
public class Message extends AbstractBaseTable {
	
	public Message(String textMsg) {
		this.textMsg = textMsg;
	}

	private String textMsg;

	public String getTextMsg() {
		return textMsg;
	}

	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(getId());
		sb.append(", ");
		sb.append(textMsg);
		sb.append("]");
		return sb.toString();
	}
}
