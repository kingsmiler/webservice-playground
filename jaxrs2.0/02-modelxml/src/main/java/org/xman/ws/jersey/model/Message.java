package org.xman.ws.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {
    private long id;
    private String author;
    private String message;
    private Date created;

    // 列表序列化为XML时需要无参构造函数,如果只是单个对象,则不需要.
    public Message() {
    }

    public Message(long id, String author, String message) {
        this.id = id;
        this.author = author;
        this.message = message;
        this.created = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
