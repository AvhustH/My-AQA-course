package com.course.syntax.Step7OOP;


public class User {
    private int id;
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

//    User(String fullName, String email, String role){
//        fullName = this.firstName +" "+this.lastName;
//
//    }

    User(String firstName, String lastName, String email, String role){
this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.role=role;
    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public void printUserInfo(){
        System.out.println(toString());
    }

    public int getId() {
        return id;
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

