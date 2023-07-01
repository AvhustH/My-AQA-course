package oop.Step7;

public class NewParent extends Parent{
    int age;
    String name;

    {
        System.out.println("Блок инициализации NewParent");
        name ="new";
        age = 100;
    }

    static {
        System.out.println("Статический блок инициализации NewParent");
    }

    NewParent (String name,int age){
        super("name",120);
        this.name =name;
        this.age =age;
        System.out.println(name);
        System.out.println(age);
    }
}
