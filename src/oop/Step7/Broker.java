package oop.Step7;

import java.lang.reflect.Array;

public class Broker implements PrintInfo {
    String name;
    String adders;
    String email;
    int number;
    Array listOfCustomers;

    Broker(String name, String adders, String email, int number) {
        this.name = name;
        this.adders = adders;
        this.email = email;
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", adders='" + adders + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + number + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
