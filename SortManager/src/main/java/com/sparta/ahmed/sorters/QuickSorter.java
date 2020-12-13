package com.sparta.ahmed.sorters;

import java.util.Arrays;

public class QuickSorter implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {
        //choose last element of array as pivot.
        int first = 0;
        int last = arrayToSort.length - 1;
        quickSort(arrayToSort, first, last);
        return arrayToSort;
    }

    public void quickSort(int arrayToSort[], int first, int last) {

        if (first < last) {
            int partitionIndex = partition(arrayToSort, first, last);

            quickSort(arrayToSort, first, partitionIndex - 1);
            quickSort(arrayToSort, partitionIndex + 1, last);
        }
    }

    public int partition(int[] array, int first, int last) {
        int pivot = array[last];
        int firstIndex = first - 1;

        for (int j = first; j < last; j++) {
            if (array[j] <= pivot) {
                firstIndex++;

                int temp = array[firstIndex];
                array[firstIndex] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[firstIndex + 1];
        array[firstIndex + 1] = array[last];
        array[last] = temp;

        return firstIndex + 1;
    }

    public String getName(){
        return "Quick Sorter";
    }


}
