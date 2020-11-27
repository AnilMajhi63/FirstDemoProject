package org.anil.restapi.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.anil.restapi.messenger.database.DatabaseClass;
import org.anil.restapi.messenger.model.Message;				

public class MessageService {

	private static Map<Long, Message> message = DatabaseClass.getMessage();
	
	public MessageService()
	{
		message.put(1l, new Message(101, "core java", "Anil weds Sabnam"));
		message.put(2l, new Message(102, "Rest Api", "pinku"));
		//message.put(3l, new Message(103, "Spring", "pinku"));45

		message.put(3l, new Message(105, "php", "Sumant"));//Test1 Heigala checked in before 1 minute new changes 
		//call kar
		
		message.put(3l, new Message(105, "php", "Sumant"));
		

		message.put(3l, new Message(105, "php", "Sumant"));//Test1 Heigala checked in before 1 minute
		message.put(3l, new Message(109, "web services", "suresh122"));
		message.put(3l, new Message(109, "web services", "suda"));

	}

	public static List<Message> getAllMessage() {
		return new ArrayList<Message>(message.values());
	}

	public Message getMessage(long id) {
		return message.get(id);
	}

	@SuppressWarnings("unchecked")
	public Message addMessage(Message message) {
		message.setId(((Map<Long, Message>) message).size() + 1);
		((Map<Long, Message>) message).put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return message.remove(id);
	}
}
