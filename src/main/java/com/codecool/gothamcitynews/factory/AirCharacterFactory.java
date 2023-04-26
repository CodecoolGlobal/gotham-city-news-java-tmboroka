package com.codecool.gothamcitynews.factory;

import com.codecool.gothamcitynews.characters.Superhero;
import com.codecool.gothamcitynews.characters.Villain;
import com.codecool.gothamcitynews.characters.air.AirSuperhero;
import com.codecool.gothamcitynews.characters.air.AirVillain;
import com.codecool.gothamcitynews.characters.land.LandSuperhero;
import com.codecool.gothamcitynews.characters.land.LandVillain;

public class AirCharacterFactory implements CharacterFactory{

    private final int strengthMultiplier;
    private final int pocketSizeMultiplier;

    public AirCharacterFactory() {
        this.strengthMultiplier = 2;
        this.pocketSizeMultiplier = 60;
    }

    @Override
    public Villain createVillain(int iterationLevel) {
        return new AirVillain(strengthMultiplier*iterationLevel -2, pocketSizeMultiplier*iterationLevel +5);
    }

    @Override
    public Superhero createSuperhero(int iterationLevel) {
        return new AirSuperhero(strengthMultiplier*iterationLevel-2);
    }

    @Override
    public String getCharacterType() {
        return "AIR";
    }

}
