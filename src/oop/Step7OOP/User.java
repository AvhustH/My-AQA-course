package oop.Step7OOP;

import java.util.Random;

public class User {
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String billingAddress;
    private String deliveryAddress;
    private String cards;
    private String role;
    private String manager;
    private int userId;

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        Random random = new Random();
        this.userId = random.nextInt();
    }

    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        String[] bufer = fullName.split(" ");
        this.firstName = bufer[0];
        this.lastName = bufer[1];
    }

    public User(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
        String[] bufer = fullName.split(" ");
        this.firstName = bufer[0];
        this.lastName = bufer[1];
    }

    public User(){

    }

    public String toStringUsers() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public void printUserInfo() {
        System.out.println(toStringUsers());
    }

    public int getUserId() {
        return userId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getCards() {
        return cards;
    }

    public String getRole() {
        return role;
    }

    public String getManager() {
        return manager;
    }


}

