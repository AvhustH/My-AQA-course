package oop.Step7OOP;

public class Parent {
    int age;
    String name;

    {
        System.out.println("Блок инициализации Parent");
        name = "test";
    }

    static {
        System.out.println("Статический блок инициализации Parent");
    }

    Parent (String name,int age){
        this.name =name;
        this.age =age;
        System.out.println(name);
        System.out.println(age);
    }
}
