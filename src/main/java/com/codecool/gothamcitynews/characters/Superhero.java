package com.codecool.gothamcitynews.characters;

import java.util.Random;

public abstract class Superhero {
    Random random = new Random();
    private final int strength;

    public Superhero(int strength) {
        this.strength = strength + getRandomModifier();
    }
    public int getStrength() {
        return strength;
    }
    private int getRandomModifier(){
        int num = random.nextInt(9);
        if (num % 2 == 0){
           return 1;
        }
        return -1;
    }


}
