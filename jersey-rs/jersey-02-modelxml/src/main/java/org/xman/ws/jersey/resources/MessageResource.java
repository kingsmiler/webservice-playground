package org.xman.ws.jersey.resources;

import org.xman.ws.jersey.model.Message;
import org.xman.ws.jersey.services.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("messages")
public class MessageResource {
    private MessageService service = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getAll() {

        return service.getAll();
    }
}
