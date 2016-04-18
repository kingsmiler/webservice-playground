package com.sivalabs.resteasydemo;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ResourceNotFoundExceptionHandler implements ExceptionMapper<ResourceNotFoundException> {

    @Override
    public Response toResponse(ResourceNotFoundException ex) {

        //For simplicity I am preparing error xml by hand.
        //Ideally we should create an ErrorResponse class to hold the error info.
        String msg = ex.getMessage();
        StringBuilder response = new StringBuilder("<response>");
        response.append("<status>failed<status>");
        response.append("<message>" + msg + "<message>");
        response.append("<response>");

        return Response.serverError().entity(response.toString()).build();
    }


}