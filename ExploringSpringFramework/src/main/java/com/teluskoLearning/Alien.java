package com.teluskoLearning;

public class Alien {

    public Alien(){
        System.out.println("Object created");
    }
    private int age;
    public void code(){
        System.out.println("Coding..");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }
}
