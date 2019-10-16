package com.company;

public class Superman extends Character {

    Superman(String name, int mp){
        super(name, mp);
    }

    public void fallAsleep(){
        this.mp += 100;
    }
}
