package com.creational.factorymethod;


import com.creational.factorymethod.message.Message;
import com.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
