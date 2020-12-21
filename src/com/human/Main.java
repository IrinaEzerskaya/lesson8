package com.human;

public class Main {

    public static void main(String[] args) {

        Human1 h1 = new Human1();
        Human2 h2 = new Human2();
        
        h1.getName();
        h1.runSlowMethod();
        h1.runFastMethod();
        h1.swimSlowMethod();
        h1.swimFastMethod();

        h2.getName();
        h2.runSlowMethod();
        h2.runFastMethod();
        h2.swimSlowMethod();
        h2.swimFastMethod();
        
    }
}
