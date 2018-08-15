package com.creational.factorymethod;


import com.creational.factorymethod.message.JSONMessage;
import com.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
