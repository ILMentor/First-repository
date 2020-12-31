package com.company;

public class Person {
    private String name, gender;
    private int age;

    {
        setname("unidentified");
        setgender("unknown");
    }
    Person(){}
    Person(String name){
        this.name = name;
    }

    void setname(String name){
        this.name = name;
    }
    void getname(){
        System.out.println("Person`s name is " + name);
    }


    void setgender(String gender){
        this.gender = gender;
    }
    void getgender(){
        System.out.println("Person`s gender is " + gender);
    }


    void setage(int age){
        this.age = age;
    }
    void getage(){
        System.out.println("Person`s age is " + age);
    }


    void showinfo(){
        System.out.printf("Name: %s \tgender: %s \tage: %d\n", name, gender, age);
    }

    void voice(){
        System.out.println("This is voice");
    }
}

class Man extends Person {
    {
        setname("unidentified");
        setgender("male");
    }
    Man(){    }
    Man(String name){
    }
    @Override
    void voice(){
        System.out.println("This is other voice");
    }
}

class Woman extends Person {
    {
        setname("unidentified");
        setgender("female");
    }

}
