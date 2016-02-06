package com.example.api.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;

import com.example.api.Response.NotAuthorizedResponse;

/**
 * Not Authorized Exception Handler
 *
 * Based on https://jersey.java.net/documentation/latest/representations.html Section 7.3
 */
public class NotAuthorizedException extends WebApplicationException{

    /**
     * Create UNAUTHORIZED Response
     */
    public NotAuthorizedException() {
        super(
            Response.status(Response.Status.UNAUTHORIZED).entity(new NotAuthorizedResponse()).type(MediaType.APPLICATION_JSON).build()
        );
    }

    /**
     * Create UNAUTHORIZED Response
     */
    public NotAuthorizedException(String message) {
        super(
            Response.status(Response.Status.UNAUTHORIZED).entity(new NotAuthorizedResponse(message)).type(MediaType.APPLICATION_JSON).build()
        );
    }
}
