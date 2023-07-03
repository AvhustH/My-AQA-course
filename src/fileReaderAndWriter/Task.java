package fileReaderAndWriter;

import oop.Step7OOP.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Task {
    private final static String NAME_FILE = "users.csv";

    public static void add(User test) {
        try {
            FileWriter writer = new FileWriter(NAME_FILE, true);
            writer.append(test.toStringUsers() + "\n");
            System.out.println("User was successfully added!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printUsers() {
        try {
            FileReader reader = new FileReader(NAME_FILE);
            Scanner scnr = new Scanner(reader);
            int lineNumber = 1;
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose option add user or print all users");
            System.out.println("Write add | print | exit");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();
            String add = "add";
            String print = "print";
            String exit = "exit";
            if (Objects.equals(choose, add)) {
                Scanner sc1 = new Scanner(System.in);
                String fulltName;
                do {
                    System.out.println("Your full name");
                    fulltName = sc1.nextLine();

                } while (!fulltName.contains(" "));
                System.out.println("Email");
                String email = sc1.nextLine();
                User firstUser = new User(fulltName, email);
                add(firstUser);
            } else if (Objects.equals(choose, print)) {
                printUsers();
            } else if (Objects.equals(choose, exit)) {
                break;
            }
        }

    }


}
