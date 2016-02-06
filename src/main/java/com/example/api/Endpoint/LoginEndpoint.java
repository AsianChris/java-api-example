package com.example.api.Endpoint;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.FormParam;

import com.example.api.Model.User;
import com.example.api.Util.Authentication;
import com.example.api.Exception.NotAuthorizedException;

/**
 * Dog Endpoint
 *
 * Sets the path to the base URL + /login
 */
@Path("login")
public class LoginEndpoint {

    /**
     * Post Method
     *
     * @returns Response;
     */
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_PLAIN)
    public Response verifyUser(
        @FormParam("username") String username,
        @FormParam("password") String password
    ) {
        try {
            User user = Authentication.verifyUser(username, password);

            String token = Authentication.createToken(user);

            return Response.status(200).entity(token).build();
        } catch(NotAuthorizedException ex) {
            throw ex;
        }

    }


}
