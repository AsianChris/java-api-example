package com.example.api.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.WebApplicationException;

import com.example.api.Response.NotFoundResponse;

/**
 * Not Authorized Exception Handler
 *
 * Based on https://jersey.java.net/documentation/latest/representations.html Section 7.3
 */
public class NotFoundException extends WebApplicationException{

    /**
     * Create UNAUTHORIZED Response
     */
    public NotFoundException() {
        super(
            Response.status(Response.Status.NOT_FOUND).entity(new NotFoundResponse()).type(MediaType.APPLICATION_JSON).build()
        );
    }

    /**
     * Create UNAUTHORIZED Response
     */
    public NotFoundException(String message) {
        super(
            Response.status(Response.Status.NOT_FOUND).entity(new NotFoundResponse(message)).type(MediaType.APPLICATION_JSON).build()
        );
    }
}
