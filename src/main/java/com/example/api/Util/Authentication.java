package com.example.api.Util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.MalformedJwtException;

import com.example.api.Exception.NotAuthorizedException;
import com.example.api.Model.User;

/**
 * Authentication Utility
 *
 * Helps Authenticate Users and Verify Tokens.
 */
public class Authentication {
    /**
     *  API Key
     *
     *  This here demo purposes only. This is not the best place to put this information
     */
    private final static String apiKey = TextCodec.BASE64.encode("0123456789ABCDEF");

    /**
     * Verify User
     *
     * @return User
     *
     * @throws NotAuthorizedException
     */
    public static User verifyUser(String username, String password) throws NotAuthorizedException {
        // For Demo Purposes only
        if( ! new String("username").equals(username) || ! new String("password").equals(password) ) {
          throw new NotAuthorizedException("Invalid Credentials");
        }

        // For Demo Purposes only
        User user = new User();
        user.setName("Bob");
        user.setAge(21);

        return user;
    }

    /**
     * Create Token
     *
     * @param user
     */
    public static String createToken(User user) {
        // For Demo Purposes Only
        // Can include other data into JWT
        String token = Jwts.builder().setSubject( user.getName() ).signWith(SignatureAlgorithm.HS512, apiKey).compact();

        return token;
    }

    /**
     * Verify Token
     *
     * @throws NotAuthorizedException
     */
    public static void verifyToken(String token) throws NotAuthorizedException {
        try {

            Jwts.parser().setSigningKey(apiKey).parseClaimsJws(token);

        // Catch Invalid Formatted JWT
        } catch (MalformedJwtException ex) {
            throw new NotAuthorizedException("Invalid Credentials");

        // Catch incorrect Signature/Token
        } catch (SignatureException ex) {
            throw new NotAuthorizedException("Invalid Credentials");
        }
    }
}
