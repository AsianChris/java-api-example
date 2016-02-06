package com.example.api.Notation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import javax.ws.rs.NameBinding;

/**
 * Secured Notation Interface
 *
 * Used to mark endpoints, or it's methods, so they are checked with the Authentication Filter prior to being processed
 *
 * Based on http://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey#26778123
 */
@NameBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Secured { }
