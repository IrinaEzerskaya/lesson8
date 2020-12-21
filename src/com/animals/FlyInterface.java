package com.company;

public interface FlyInterface {

    default void flyMethod() {
        System.out.println("- умеет летать");
    }
}
