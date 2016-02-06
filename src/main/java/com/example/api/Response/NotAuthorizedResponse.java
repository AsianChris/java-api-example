package com.example.api.Response;

/**
 * Not Authorized Response
 *
 * Used when there is a 401 Response. This is the object that will be passed back
 */
public class NotAuthorizedResponse {
    /**
     * HTTP Status Code
     */
    public final int statusCode = 401;

    /**
     * Message
     */
    public String message = "Not Authorized";

    /**
     * Class Constructor
     */
    public NotAuthorizedResponse() {}

    /**
     * Class Constructor
     *
     * @param message Not Auth Message
     */
    public NotAuthorizedResponse(String message) {
        this.message = message;
    }

}
