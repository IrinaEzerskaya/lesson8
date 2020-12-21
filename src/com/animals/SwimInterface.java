package com.animals;

public interface SwimInterface {

    default void swimMethod() {
        System.out.println("- умеет плавать");
    }

}
