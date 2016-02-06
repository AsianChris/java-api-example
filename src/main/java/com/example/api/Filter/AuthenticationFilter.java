package com.example.api.Filter;

import javax.annotation.Priority;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.Priorities;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.IOException;

import com.example.api.Notation.Secured;
import com.example.api.Response.NotAuthorizedResponse;
import com.example.api.Exception.NotAuthorizedException;
import com.example.api.Util.Authentication;

/**
 * Authentication Filter
 *
 * Security Filter for specified endpoints/methods that are using the @Secured Notation
 * Based on http://stackoverflow.com/a/26778123
 */
@Secured
@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationFilter implements ContainerRequestFilter {

    /**
     * Filter
     *
     * @param requestContext ContainerRequestFilter
     *
     * @throws NotAuthorizedException
     */
    @Override
    public void filter(ContainerRequestContext requestContext) throws NotAuthorizedException {

        // Get the HTTP Authorization header from the request
        String authorizationHeader =
            requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);

        // Check if the HTTP Authorization header is present and formatted correctly
        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }

        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer".length()).trim();

        try {

            Authentication.verifyToken(token);

        } catch (NotAuthorizedException ex) {
            throw ex;
        }
    }
}
