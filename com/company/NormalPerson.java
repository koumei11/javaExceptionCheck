package com.company;

public class NormalPerson extends Character {

    NormalPerson(String name, int mp){
        super(name, mp);
    }

    public void fallAsleep(){
        mp += 10;
    }
}
