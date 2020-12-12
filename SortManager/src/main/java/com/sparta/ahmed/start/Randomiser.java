package com.sparta.ahmed.start;

import java.util.Random;

public class Randomiser {

    public int createRandomInteger(){
        Random random = new Random();
        int randomInt = random.nextInt(99) + 1;
        return randomInt;
    }

    public int[] createRandomArray(int arrayLength) {
        Random random = new Random();
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = random.nextInt(arrayLength * 10) + 1;
        }
        return newArray;
    }

}
