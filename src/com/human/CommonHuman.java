package com.human;

public abstract class CommonHuman implements runHumanInterface,swimHumanInterface {
    public abstract void getName();
    public abstract void runSlowMethod();
    public abstract void runFastMethod();
    public abstract void swimSlowMethod();
    public abstract void swimFastMethod();
}
