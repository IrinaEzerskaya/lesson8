package com.company;

public class Duck extends Animal implements RunInterface,SwimInterface,FlyInterface {

    public void getName() {
        System.out.println("Это утка!");
    }

}
