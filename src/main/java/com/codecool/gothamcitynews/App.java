package com.codecool.gothamcitynews;

import com.codecool.gothamcitynews.factory.*;
import com.codecool.gothamcitynews.logic.FactoryProducer;
import com.codecool.gothamcitynews.logic.GothamCity1Hour;

import java.util.List;

public class App {

    public static void main(String[] args) {
        int iterationLevel = 5;
        int resources = 900;
        FactoryProducer factoryProducer = new FactoryProducer(createFactoryList());
        GothamCity1Hour gothamCity1Hour = new GothamCity1Hour(resources, factoryProducer.pickFactory());
        for (int i = 1; i <= iterationLevel ; i++) {
            gothamCity1Hour.oneHour(i);
        }
    }
    private static List<CharacterFactory> createFactoryList(){
        AirCharacterFactory airCharacterFactory = new AirCharacterFactory();
        WaterCharacterFactory waterCharacterFactory = new WaterCharacterFactory();
        LandCharacterFactory landCharacterFactory = new LandCharacterFactory();
        return List.of(airCharacterFactory, waterCharacterFactory, landCharacterFactory);
    }
}
