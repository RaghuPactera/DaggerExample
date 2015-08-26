package com.raghu.daggerexample.model;

/**
 * Created by raghunandanangara on 4/08/2015.
 */
public class Motor {
    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
