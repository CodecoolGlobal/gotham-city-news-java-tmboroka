package com.codecool.gothamcitynews.factory;

import com.codecool.gothamcitynews.characters.Superhero;
import com.codecool.gothamcitynews.characters.Villain;
import com.codecool.gothamcitynews.characters.land.LandSuperhero;
import com.codecool.gothamcitynews.characters.land.LandVillain;

public class LandCharacterFactory implements CharacterFactory {
    private final int strengthMultiplier;
    private final int pocketSizeMultiplier;

    public LandCharacterFactory() {
        this.strengthMultiplier = 3;
        this.pocketSizeMultiplier = 45;
    }

    @Override
    public Villain createVillain(int iterationLevel) {
        return new LandVillain(strengthMultiplier*iterationLevel, pocketSizeMultiplier*iterationLevel);
    }

    @Override
    public Superhero createSuperhero(int iterationLevel) {
        return new LandSuperhero(strengthMultiplier*iterationLevel);
    }

    @Override
    public String getCharacterType() {
        return "LAND";
    }
}
