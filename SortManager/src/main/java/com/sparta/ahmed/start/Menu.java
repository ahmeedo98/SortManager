package com.sparta.ahmed.start;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    private Scanner userInput = new Scanner(System.in);
    private int sortingAlgorithm;
    private int arrayLength;
    private int chosenMethod;

    public int chooseMethod() {
        System.out.println("Would you like to :: ");
        System.out.println("1. Choose a sorting algorithm?");
        System.out.println("2. Run performance tests on all algorithms?");
        System.out.println("");
        System.out.println("Enter 1 or 2");
        chosenMethod = userInput.nextInt();
        return chosenMethod;
    }

    public int chooseSortAlgorithm() {
        System.out.println("Which sorting algorithm would you like to use?");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Selection Sort");
        System.out.println("6. Binary Tree Sort");
        sortingAlgorithm = userInput.nextInt();
        return sortingAlgorithm;
    }

    public int chooseArrayLength() {
        System.out.println("Choose an array length, the values will be randomly generated.");
        arrayLength = userInput.nextInt();
        return arrayLength;
    }

    public void printRandomArray(int[] array) {
        System.out.println("The array created is :: " + Arrays.toString(array));
    }


    public void printUserInputs() {
        System.out.println("The Sorting Algorithm you have chosen is :: " + printSortingAlgorithmName(sortingAlgorithm));
        System.out.println("The array length you have chosen is :: " + arrayLength);
    }

    public void printSortingResults(int[] arrayToPrint) {
        System.out.println("The SORTED array is now :: " + Arrays.toString(arrayToPrint));
    }

    public String printSortingAlgorithmName(int sortingAlgorithm) {
        switch (sortingAlgorithm) {
            case 1:
                return "Bubble Sort";
            case 2:
                return "Insertion Sort";
            case 3:
                return "Merge Sort";
            case 4:
                return "Quick Sort";
            case 5:
                return "Selection Sort";
            case 6:
                return "Binary Tree Sort";
        }
        return "No sorting algorithm chosen";
    }

    public void printPerformanceTest(long timeTaken) {
        System.out.println("Time taken to sort the algorithm was :: " + timeTaken);
    }
}