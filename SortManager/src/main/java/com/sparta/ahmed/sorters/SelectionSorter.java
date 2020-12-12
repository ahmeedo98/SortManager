package com.sparta.ahmed.sorters;

import java.util.Arrays;

public class SelectionSorter implements Sorter{

    @Override
    public int[] sortArray(int[] array) {
        int arrayLength = array.length;
        int smallest = 0;
        int temp = 0;

        for (int i = 0; i < arrayLength-1; i++)
        {
            smallest = i;
            for (int j = i+1; j < arrayLength; j++) {
                if (array[j] < array[smallest])
                    smallest = j;
            }

            temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
