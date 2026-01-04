package com.teluskoLearning;

public class Alien {

    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int age, Laptop lap){
        System.out.println("Para constructor called");
        this.age = age;
        this.lap = lap;
    }
    private int age;
    private Laptop lap;
    public void code(){
        lap.compile();
        System.out.println("Coding..");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
