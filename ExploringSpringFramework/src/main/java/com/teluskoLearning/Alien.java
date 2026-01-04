package com.teluskoLearning;

public class Alien {

    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int age, Computer computer){
        System.out.println("Para constructor called");
        this.age = age;
        this.computer = computer;
    }
    private int age;
    private Computer computer;
    public void code(){
        computer.compile();
        System.out.println("Coding..");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
