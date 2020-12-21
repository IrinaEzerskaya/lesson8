package com.animals;

public class Main {

    public static void main(String[] args) {

        Elefant elefant = new Elefant();
        Mouse mouse = new Mouse();
        Duck duck = new Duck();

        elefant.getName();
        elefant.runMethod();
        elefant.swimMethod();

        mouse.getName();
        mouse.runMethod();

        duck.getName();
        duck.flyMethod();
        duck.swimMethod();
        duck.runMethod();

    }
}
