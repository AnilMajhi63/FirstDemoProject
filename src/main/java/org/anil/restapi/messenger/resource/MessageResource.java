package org.anil.restapi.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.anil.restapi.messenger.model.Message;
import org.anil.restapi.messenger.service.MessageService;

@Path("/message")
public class MessageResource {

	MessageService messageService = new MessageService();

	@GET
	 /*@Produces(MediaType.APPLICATION_JSON)*/
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return messageService.getAllMessage();
	}
	
	@POST
	/*@Path("/addmessage")*/
	/*@Produces(MediaType.APPLICATION_JSON)*/
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_ATOM_XML)
	public Message addMessage(Message message)
	{
		return messageService.addMessage(message);
	}

	@GET
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMesssage(@PathParam("messageid") long id) {
		return messageService.removeMessage(id);
	}
}
