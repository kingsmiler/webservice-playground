package com.nuwan.poc.wsmodule.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


/**
 * User: Nuwan.N.Bandara
 */
@XmlRootElement
public class Response {
    private long id;
    private String status;
    private String message;

    public long getId() {
        return (new Date()).getTime();
    }

    @XmlAttribute
    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    @XmlElement
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    @XmlElement
    public void setMessage(String message) {
        this.message = message;
    }
}