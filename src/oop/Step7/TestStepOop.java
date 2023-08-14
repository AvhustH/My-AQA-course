package oop.Step7;

import java.util.Objects;
import java.util.Scanner;

import static oop.Step7.RoleType.*;

public class TestStepOop {
    public static void main(String[] args) throws CartException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your first name");
        String firstName = sc.nextLine();
        System.out.println("Your last name");
        String secondName = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        System.out.println("Role");
        Role role1 = new Role(false, false, false, false);
        String role = sc.nextLine();
        RoleType usersRole = RoleType.valueOf(role);
        if (Objects.equals(usersRole, ADMIN)) {
            role1 = new Role(true, true, true, true);
            System.out.println("ROLE ADMIN");
        } else if (Objects.equals(usersRole, CUSTOMER)) {
            role1 = new Role(true, false, true, false);
        } else if (Objects.equals(usersRole, MAIN_CUSTOMER)) {
            role1 = new Role(true, true, true, false);
        } else if (Objects.equals(usersRole, VIEWER)) {
            role1 = new Role(true, false, false, false);
        }

        System.out.print("Number: ");
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        String plus = "+";
        if (phoneNumber.charAt(0) != plus.charAt(0)) {
            while (true) {
                System.out.println("Number should start by +");
                Scanner newScan = new Scanner(System.in);
                String newPhoneNumber = newScan.nextLine();
                if (newPhoneNumber.charAt(0) == plus.charAt(0)) {
                    phoneNumber = newPhoneNumber;
                    break;
                }
            }
        }

        User firstUser = new User(firstName, secondName, email, role);
        firstUser.setPhoneNumber(phoneNumber);
        System.out.println("Number of cart: ");
        long cartNumber = Long.parseLong(scan.nextLine());

//firstUser.printInfo();

        try { //Task2
            firstUser.setCards(cartNumber);
        } catch (CartException e) {
            System.err.println(e.getMessage());
        }

        firstUser.printAllCard();

        firstUser.printInfo();

//        Broker vroker = new Broker("1","2","5",1);
//        vroker.printInfo();

//Parent testparent = new Parent("testonme",12);
//NewParent testNewParent = new NewParent("testMe",14);
    }
}

