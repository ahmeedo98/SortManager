package com.sparta.ahmed.sorters;

import java.util.Arrays;

public class InsertionSorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int arrLength = arrayToSort.length;
        for (int i = 1; i < arrLength; i++) {
            int key = arrayToSort[i];
            int j = i - 1;
            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = key;
        }
        return arrayToSort;
    }

    public String getName(){
        return "Insertion Sorter";
    }

}
