package com.sparta.ahmed;

import com.sparta.ahmed.sorters.BubbleSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSorterTest {

    @Test
    void doesArrayGiveSorted(){
        BubbleSorter bubbleSorter = new BubbleSorter();
        int[] sortedArr = {1,2,3,4,5,6};
        int[] arr = {2,5,3,1,4,6};
        Assertions.assertEquals(Arrays.toString(sortedArr), Arrays.toString(bubbleSorter.sortArray(arr)));
    }

    void doesLargeArrayGiveSorted(){

    }
}
