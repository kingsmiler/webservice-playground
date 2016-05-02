package org.xman.ws.jersey.services;

import org.xman.ws.jersey.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    public List<Message> getAll() {
        Message m1 = new Message(1L, "Wang", "Hello, Wang!");
        Message m2 = new Message(2L, "Wang", "Hello, Restful!");
        Message m3 = new Message(3L, "Wang", "Hello, Jersey!");

        ArrayList<Message> messages = new ArrayList<>(3);
        messages.add(m1);
        messages.add(m2);
        messages.add(m3);

        return messages;
    }
}
