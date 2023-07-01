package oop.Step7OOP;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class User implements PrintInfo {
    private static int userId;
    List<Long> allCard;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String billingAddress;
    private String deliveryAddress;
    private long cards;
    private String role;
    private String manager;

    User(String firstName, String lastName, String email, String role) {
        userId = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        userId++;
    }

    User(String fullName, String email, String role) {
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        String[] buffer = fullName.split(" ");
        this.firstName = buffer[0];
        this.lastName = buffer[1];
        userId++;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public String printInfo() {
        System.out.println(toString());
        return null;
    }

    public int getUserId() {
        return userId;
    }

    public void printAllCard() {
        allCard.forEach(System.out::println);
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public long getCards() {
        return cards;
    }

    public void setCards(long cards) throws CartException { //Task 1
        double x = Math.ceil(Math.log10(cards));
        if (x != 16) {
            throw new CartException("Cart incorrect");
        }
        this.cards = cards;
        allCard.add(cards);
    }

    public String getRole() {
        return role;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


}

