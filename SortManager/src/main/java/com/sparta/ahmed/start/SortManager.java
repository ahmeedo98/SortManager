package com.sparta.ahmed.start;

import com.sparta.ahmed.binaryTree.BinaryTree;
import com.sparta.ahmed.sorters.*;

import java.util.Random;

public class SortManager {

    public Sorter getSorter(int sorter, int number) {
        //switch s
        switch (sorter) {
            case 1:
                return new BubbleSorter();
            case 2:
                return new InsertionSorter();
            case 3:
                return new MergeSorter();
            case 4:
                return new QuickSorter();
            case 5:
                return new SelectionSorter();
            case 6:
                return new BinaryTree(number);
        }

        return null;
    }


    //create class

}
