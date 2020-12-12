package com.sparta.ahmed.sorters;

import java.util.Arrays;

public class MergeSorter implements Sorter {

    public void mergeSorter(int[] array) {
        int length = array.length;
        if (array.length < 2) {
            return;
        }
        int midArray = length / 2;
        int[] leftArr = new int[midArray];
        int[] rightArr = new int[length - midArray];

        for (int i = 0; i < midArray; i++) {
            leftArr[i] = array[i];
        }
        for (int i = midArray; i < length; i++) {
            rightArr[i - midArray] = array[i];
        }
        mergeSorter(leftArr);
        mergeSorter(rightArr);

        merge(leftArr, rightArr, array, midArray, length - midArray);

    }

    public void merge(int[] left, int[] right, int[] array, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < leftLength) {
            array[k++] = left[i++];
        }
        while (j < rightLength) {
            array[k++] = right[j++];
        }
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        mergeSorter(arrayToSort);
        return arrayToSort;
    }
}
