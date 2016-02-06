package com.example.api.Response;

/**
 * Not Found Response
 *
 * Used when there is a 404 Response. This is the object that will be passed back
 */
public class NotFoundResponse{
  /**
   * HTTP Status Code
   */
  public final int statusCode = 404;

  /**
   * Message
   */
  public final String message = "Not Found";

}
