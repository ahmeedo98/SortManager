package com.sparta.ahmed.sorters;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        boolean swapped = true;
        int arrayLength = arrayToSort.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            while (swapped) {
                swapped = false;
                for (int j = 0; j < arrayLength - i - 1; j++)
                    if (arrayToSort[j] > arrayToSort[j + 1]) {
                        int temp = arrayToSort[j];
                        arrayToSort[j] = arrayToSort[j + 1];
                        arrayToSort[j + 1] = temp;
                        swapped = true;
                    }
            }
        }
        return arrayToSort;
    }

}
