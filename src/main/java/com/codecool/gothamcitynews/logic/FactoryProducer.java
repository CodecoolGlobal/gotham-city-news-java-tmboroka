package com.codecool.gothamcitynews.logic;

import com.codecool.gothamcitynews.characters.Villain;
import com.codecool.gothamcitynews.factory.CharacterFactory;

import java.util.List;
import java.util.Random;

public class FactoryProducer {
    private List<CharacterFactory> options;
    private Random random;
    public FactoryProducer(List<CharacterFactory> options) {
        this.options = options;
        this.random = new Random();
    }

    public CharacterFactory pickFactory(){
        int currentCharacterType = random.nextInt(options.size());
        return options.get(currentCharacterType);
    }
}
