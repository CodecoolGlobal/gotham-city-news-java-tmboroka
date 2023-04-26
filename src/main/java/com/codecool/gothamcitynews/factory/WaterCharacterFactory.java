package com.codecool.gothamcitynews.factory;

import com.codecool.gothamcitynews.characters.Superhero;
import com.codecool.gothamcitynews.characters.Villain;
import com.codecool.gothamcitynews.characters.land.LandSuperhero;
import com.codecool.gothamcitynews.characters.land.LandVillain;
import com.codecool.gothamcitynews.characters.water.WaterSuperhero;
import com.codecool.gothamcitynews.characters.water.WaterVillain;

public class WaterCharacterFactory implements CharacterFactory{
    private final int strengthMultiplier;

    public WaterCharacterFactory() {
        this.strengthMultiplier = 30;
    }

    @Override
    public Villain createVillain(int iterationLevel) {
        return new WaterVillain(strengthMultiplier*iterationLevel, strengthMultiplier/2*iterationLevel);
    }

    @Override
    public Superhero createSuperhero(int iterationLevel) {
        return new WaterSuperhero(strengthMultiplier*iterationLevel);
    }

    @Override
    public String getCharacterType() {
        return "WATER";
    }
}
