package com.sparta.ahmed.start;

import com.sparta.ahmed.sorters.Sorter;

import java.util.InputMismatchException;

public class Starter {

    public static void start() {
        //create menu
        Menu menu = new Menu();
        //take method to run
        try {
            int start = menu.chooseMethod();
            if (start == 1) {
                runSortingALgorithm();
            } else if (start == 2) {
                runPerformanceTests();
            } else {
                System.out.println("Please input 1 or 2");
                start();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input not accepted, please input 1 or 2");
            start();
        }


    }

    private static void runSortingALgorithm() {
        //create menu, factory and randomiser
        Menu menu = new Menu();
        SortManager sortManagerFactory = new SortManager();
        Randomiser randomiser = new Randomiser();

        //take input
        int sorter = menu.chooseSortAlgorithm();
        int arrayLength = menu.chooseArrayLength();
        menu.printUserInputs();

        //create array
        int[] array = randomiser.createRandomArray(arrayLength);
        menu.printRandomArray(array);
        int number = array[0];

        //create chosen sorter
        Sorter chosenSorter = sortManagerFactory.getSorter(sorter, number); //pass number for binary tree root

        //test time to run sorter
        long start = System.nanoTime();
        int[] sortedArray = chosenSorter.sortArray(array);
        long end = System.nanoTime();
        long timeTaken = ((end - start));

        //print results
        menu.printPerformanceTest(timeTaken);
        menu.printSortingResults(sortedArray);

        int restart = menu.restartProgram();
        if (restart == 1) {
            start();
        } else {
            System.out.println("Thanks for trying this program!");
        }
    }

    private static void runPerformanceTests() {
        //create menu, factor and randomiser
        Menu menu = new Menu();
        SortManager sortManagerFactory = new SortManager();
        Randomiser randomiser = new Randomiser();

        //create random array
        int arrayLength = randomiser.createRandomInteger();
        int[] array = randomiser.createRandomArray(arrayLength);
        int number = 0;

        //loop through each sorter
        for (int i = 1; i <= 6; i++) {
            //create sorter
            Sorter chosenSorter = sortManagerFactory.getSorter(i, number); //pass number for binary tree root

            //test time to run sorter
            long start = System.nanoTime();
            int[] sortedArray = chosenSorter.sortArray(array);
            long end = System.nanoTime();
            long timeTaken = ((end - start));
            menu.printPerformanceTests(timeTaken, i);
        }
        int restart = menu.restartProgram();
        try {
            if (restart == 1) {
                start();
            } else {
                System.out.println("Thanks for trying this program!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input not accepted, please input 1 or 2");

        }
    }
}