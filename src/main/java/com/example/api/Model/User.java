package com.example.api.Model;

/**
 * User Model
 */
public class User {
    /**
     * User's Name
     */
    private String name;

    /**
     * User's Age
     */
    private int age;

    /**
     * Set Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set Age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get Age
     */
    public int getAge() {
        return this.age;
    }
}
