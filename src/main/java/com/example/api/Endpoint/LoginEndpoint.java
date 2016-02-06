package com.example.api.Endpoint;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.FormParam;
import javax.json.Json;
import javax.json.JsonObject;

import com.example.api.Model.JWT;
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
    @Produces(MediaType.APPLICATION_JSON)
    public Response verifyUser(
        @FormParam("username") String username,
        @FormParam("password") String password
    ) {
        try {
            User user = Authentication.verifyUser(username, password);

            String token = Authentication.createToken(user);

            JWT response = new JWT();

            response.user = user;
            response.token = token;

            return Response.status(200).entity(response).build();
        } catch(NotAuthorizedException ex) {
            throw ex;
        }

    }


}
