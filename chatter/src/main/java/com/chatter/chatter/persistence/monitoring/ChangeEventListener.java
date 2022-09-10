package com.chatter.chatter.persistence.monitoring;

import com.mongodb.event.CommandListener;
import com.mongodb.event.CommandSucceededEvent;

public class ChangeEventListener implements CommandListener {
	
	@Override
	public synchronized void commandSucceeded(final CommandSucceededEvent event) {

	}

}
