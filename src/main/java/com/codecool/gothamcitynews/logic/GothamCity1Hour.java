package com.codecool.gothamcitynews.logic;

import com.codecool.gothamcitynews.characters.Superhero;
import com.codecool.gothamcitynews.characters.Villain;
import com.codecool.gothamcitynews.factory.AirCharacterFactory;
import com.codecool.gothamcitynews.factory.CharacterFactory;
import com.codecool.gothamcitynews.factory.LandCharacterFactory;
import com.codecool.gothamcitynews.factory.WaterCharacterFactory;

import java.util.List;

public class GothamCity1Hour {

    private int resources;
    private CharacterFactory characterFactory;

    public GothamCity1Hour(int resources, CharacterFactory characterFactory) {
        this.resources = resources;
        this.characterFactory = characterFactory;
    }

    private Villain createVillain(int iterationLevel){
        return characterFactory.createVillain(iterationLevel);
    }

    private void villainSteal(Villain currentVillain){
        resources = resources- currentVillain.getPocketSize();
    }

    private Superhero createSuperhero(int iterationLevel){
        return characterFactory.createSuperhero(iterationLevel);
    }

    private int fight(Villain villain, Superhero superhero){
        int retrieved = 0;
        if(superhero.getStrength() > villain.getStrength()){
            retrieved = villain.getPocketSize();
            System.out.println("Hero won");
        } else {
        System.out.println("Villain won");
        }
        return retrieved;
    }

    public void oneHour(int iterationLevel){
        System.out.println(iterationLevel + ". hour in Gotham \nThere are " + resources + " gold in the city hall");

        Villain currentVillain = createVillain(iterationLevel);
        villainSteal(currentVillain);
        Superhero currentHero = createSuperhero(iterationLevel);
        System.out.println(characterFactory.getCharacterType() + " villain escaped from the prison and stole " + currentVillain.getPocketSize() + " gold from the city hall");
        System.out.println(characterFactory.getCharacterType() + " hero came to save the city");
        System.out.println("Hero strength: " + currentHero.getStrength() + "\n Villain strength: " + currentVillain.getStrength());

        int retrievedResources = fight(currentVillain, currentHero);
        resources += retrievedResources;
        System.out.println("Gold in the end of the day: " + resources);
        System.out.println("\n-------------END-------------\n");
    }
}
