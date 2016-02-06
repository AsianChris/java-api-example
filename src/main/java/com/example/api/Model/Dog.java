package com.example.api.Model;

/**
 * Dog Model
 */
public class Dog {
    /**
     * Dog's Name
     */
    private String name;

    /**
     * Type of Dog
     */
    private String type;

    /**
     * Dog's Age
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
     * Set Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get Type
     */
    public String getType() {
        return this.type;
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
