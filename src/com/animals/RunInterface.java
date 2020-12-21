package com.company;

public interface RunInterface {

    default void runMethod() {
        System.out.println("- умеет бегать");
    }

}
