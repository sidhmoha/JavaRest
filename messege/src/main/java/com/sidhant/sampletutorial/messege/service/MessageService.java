package com.sidhant.sampletutorial.messege.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sidhant.sampletutorial.messege.database.DatabaseClass;
import com.sidhant.sampletutorial.messege.exception.DataNotFoundException;
import com.sidhant.sampletutorial.messege.model.Message;


public class MessageService {

	private Map<Long,Message> messages= DatabaseClass.getMessages();
	 public MessageService(){
		messages.put(1L, new Message(1,"Hello World","Koushik"));
		messages.put(2L, new Message(2,"Hello Jersey","Sidhant"));
	}
	
	
	
	public List<Message> getAllMessages(){
		/*
		Message m1= new Message(1L,"Hello World","Koushik");
		Message m2= new Message(2L,"Hello Jersey","Sidhant");
		
		List<Message> list= new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		*/
		return new ArrayList<Message>(messages.values());
		}
	public Message getMessage(long id){
		//return messages.get(id);
		Message message= messages.get(id);
		if (message==null)
		{
			throw new DataNotFoundException("Message with id "+ id + "not found");
		}
		return message;
	}
	
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message updateMessage(Message message)
	{
		if (message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
	
	
	
	
	
	
	
	
}
