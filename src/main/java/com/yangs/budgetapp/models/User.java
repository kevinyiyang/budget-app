package com.yangs.budgetapp.models;

public class User {
    public final long userId;
    private String firstName;
    private String lastName;
    private UserClassification classification;


    public final static String DEFAULT_LAST_NAME = "";

    public User(String firstName, String lastName) {
        this(firstName, lastName, UserClassification.REGULAR);
    }

    public User(String firstName) {
        this(firstName, DEFAULT_LAST_NAME);
    }

    private User(String firstName, String lastName, UserClassification classification) {
        this.userId = Math.round(Math.random());
        this.firstName = firstName;
        this.lastName = lastName;
        this.classification = classification;
    }

    public long getUserId() {
        return userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setClassification(UserClassification classification) {
        this.classification = classification;
    }

    public static String sayHello() {
        return "Hello!";
    }
}
