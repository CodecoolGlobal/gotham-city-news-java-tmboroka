package com.codecool.gothamcitynews.characters;

public abstract class Villain {


    private int strength;

    private int pocketSize;

    public Villain(int strength, int pocketSize) {
        this.strength = strength;
        this.pocketSize = pocketSize;
    }
    public int getPocketSize() {
        return pocketSize;
    }
    public int getStrength() {
        return strength;
    }

}
