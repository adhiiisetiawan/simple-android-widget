package com.example.simplewidget;

import java.util.Random;

public class RandomNumberGenerator {

    public static int Generate(int max){
        Random random = new Random();
        return random.nextInt(max);
    }
}
