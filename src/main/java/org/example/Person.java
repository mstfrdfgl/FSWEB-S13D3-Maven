package org.example;

public class Person{
    String firstName;
    String lastName;
    int age;
    int weight;
    double height;
    String country;

    public Person(){

    }
    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName,String lastName,int age,int weight,double height,String country){
        this(firstName,lastName,age);
        this.weight=weight;
        this.height=height;
        this.country=country;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return (age>=13) && (age <19);
    }
}