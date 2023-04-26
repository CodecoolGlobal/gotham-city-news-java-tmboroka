package com.codecool.gothamcitynews.factory;

import com.codecool.gothamcitynews.characters.Superhero;
import com.codecool.gothamcitynews.characters.Villain;

public interface CharacterFactory {
    Villain createVillain(int iterationLevel);
    Superhero createSuperhero(int iterationLevel);
    String getCharacterType();
}
