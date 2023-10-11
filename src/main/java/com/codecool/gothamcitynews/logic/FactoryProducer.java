package com.codecool.gothamcitynews.logic;

import com.codecool.gothamcitynews.characters.Villain;
import com.codecool.gothamcitynews.factory.CharacterFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FactoryProducer {
    private List<CharacterFactory> options;
    private Random random;
    public FactoryProducer(List<CharacterFactory> options) {
        this.options = new ArrayList<>(options);
        this.random = new Random();
    }

    public CharacterFactory pickFactory(){
        return options.get(random.nextInt(options.size()));
    }
}
