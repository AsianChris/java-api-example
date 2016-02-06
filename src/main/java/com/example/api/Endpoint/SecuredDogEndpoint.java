package com.example.api.Endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.api.Notation.Secured;

import com.example.api.Model.Dog;

/**
 * Secured Dog Endpoint
 *
 * Sets the path to the base URL + /secured
 */
@Path("secured")
public class SecuredDogEndpoint {
    /**
     * GET Method
     *
     * This endpoint method is secured, so the Authentication Filter will be ran first.
     *
     * @returns Response;
     */
    @GET
    @Secured
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayPlainTextHello() {
        Dog rebel = new Dog();

        rebel.setName("Rebel");

        rebel.setType("Yorkshire Terrier");

        rebel.setAge(8);

    	  return Response.status(200).entity(rebel).build();
    }


}
