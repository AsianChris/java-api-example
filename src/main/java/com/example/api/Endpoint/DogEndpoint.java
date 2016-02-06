package com.example.api.Endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.api.Model.Dog;

/**
 * Dog Endpoint
 *
 * Sets the path to the base URL + /dog
 */
@Path("dog")
public class DogEndpoint {

    /**
     * GET Method
     *
     * @returns Response;
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFido() {
        Dog rebel = new Dog();

        rebel.setName("Fido");

        rebel.setType("Golden Retriever");

        rebel.setAge(8);

        return Response.status(200).entity(rebel).build();
    }


}
