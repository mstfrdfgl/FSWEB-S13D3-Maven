package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("-----------------");
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("IsTeen: " + person1.isTeen());
        System.out.println("-------------------");
        Person person2 = new Person("Mustafa", "Redifoğlu", 26, 66, 1.68, "Kayseri");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Lastname: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Weight: " + person2.weight);
        System.out.println("Height: " + person2.height);
        System.out.println("Country: " + person2.country);
        System.out.println("IsTeen: " + person2.isTeen());
        System.out.println("---------------------");
        //wall

        Wall wall = new Wall(5, 4);
        System.out.println("area=" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());
    }
}
