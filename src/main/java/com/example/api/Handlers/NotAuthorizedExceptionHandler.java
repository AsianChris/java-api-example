package com.example.api.Handlers;

import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.core.Response;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;

import com.example.api.Response.NotAuthorizedResponse;

/**
 * Not Authorized Exception Handler
 *
 * Based on http://stackoverflow.com/a/23858695
 */
@Provider
public class NotAuthorizedExceptionHandler implements ExceptionMapper<NotAuthorizedException>{

    /**
     * Create UNAUTHORIZED Response
     */
    public Response toResponse(NotAuthorizedException ex){
        return Response.status(Response.Status.UNAUTHORIZED).entity(new NotAuthorizedResponse()).type(MediaType.APPLICATION_JSON).build();
    }
}
