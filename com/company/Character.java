package com.company;

abstract class Character {
    String name;
    int mp;

    Character(String name, int mp){
        this.name = name;
        this.mp = mp;
    }

    void run(){
        System.out.println(name + "は走った");
        if(mp > 0){
            mp -= 1;
        }
    }

    abstract void fallAsleep();
}
