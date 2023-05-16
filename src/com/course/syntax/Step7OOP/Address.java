package com.course.syntax.Step7OOP;

import java.util.Random;

public class Address {
    private int id;
    private String country;
    private String city;
    private String street;
    private String numberStreet;
    private int room;
    private int zip;

    Address(String country, String city, String street, String numberStreet, Integer zip) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.numberStreet = numberStreet;
        this.zip = zip;
        Random random = new Random();
        this.id = random.nextInt();
    }

    @Override
    public String toString() {
        return "Addres{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberStreet='" + numberStreet + '\'' +
                ", room=" + room +
                ", zip=" + zip +
                '}';
    }

    public void printAddresInfo() {
        System.out.println(toString());
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberStreet(String numberStreet) {
        this.numberStreet = numberStreet;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberStreet() {
        return numberStreet;
    }

    public int getRoom() {
        return room;
    }

    public int getZip() {
        return zip;
    }
}
