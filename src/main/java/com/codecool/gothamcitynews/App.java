package com.codecool.gothamcitynews;

import com.codecool.gothamcitynews.factory.*;
import com.codecool.gothamcitynews.logic.FactoryProducer;
import com.codecool.gothamcitynews.logic.GothamCity1Hour;

import java.util.List;

public class App {
    public static void main(String[] args) {
        int iterationLevel = 5;
        GothamCity1Hour gothamCity1Hour = new GothamCity1Hour( 400);
        for (int i = 1; i <= iterationLevel ; i++) {
            gothamCity1Hour.oneHour(i);
        }
    }
}
