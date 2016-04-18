package com.restfully.shop.services;

import org.jboss.resteasy.specimpl.BuiltResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloResource {


    @GET
    @Path("testWebService")
    @Produces({MediaType.APPLICATION_XML})
    public Response testWebService(int value) throws Exception {
        Response response = new BuiltResponse();

        return response;
    }

}
