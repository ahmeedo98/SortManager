package com.sparta.ahmed;

import com.sparta.ahmed.sorters.BubbleSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSorterTest {

    @Test
    void doesSorterSortArray(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] arr = {2,5,3,1,4,6};
        int[] sortedArr = {1,2,3,4,5,6};
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }

    @Test
    void doesSorterSortDuplicates(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] arr = {5,5,5,3,3,2,10,10,6,6,6,1};
        int[] sortedArr = {1,2,3,3,5,5,5,6,6,6,10,10};
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }

    @Test
    void doesSorterAcceptEmptyArray(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] sortedArr = {};
        int[] arr = {};
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }

    @Test
    void doesSorterAcceptNull(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] sortedArr = null;
        int[] arr = null;
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }

    @Test
    void doesSorterSortNegativeValues(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] arr = {-2,-5,-3,-1,4,6};
        int[] sortedArr = {-5,-3,-2,-1,4,6};
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }

    @Test
    void doesSorterSortOneValue(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] arr = {2};
        int[] sortedArr = {2};
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }




}
