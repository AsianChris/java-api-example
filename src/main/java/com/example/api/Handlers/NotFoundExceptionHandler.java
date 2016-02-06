package com.example.api.Handlers;

import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.core.Response;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;

import com.example.api.Response.NotFoundResponse;

/**
 * Not Found Exception Handler
 *
 * This is the catch all for 404 Responses
 *
 * Based on http://stackoverflow.com/a/23858695
 */
@Provider
public class NotFoundExceptionHandler implements ExceptionMapper<NotFoundException>{

    /**
     * Create NOT_FOUND Response
     */
    public Response toResponse(NotFoundException ex){
        return Response.status(Response.Status.NOT_FOUND).entity(new NotFoundResponse()).type(MediaType.APPLICATION_JSON).build();
    }
}
