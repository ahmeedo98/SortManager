package com.sparta.ahmed;

import com.sparta.ahmed.binaryTree.BinaryTree;
import com.sparta.ahmed.sorters.SelectionSorter;

import java.util.Arrays;

public class Scratch {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        int[] arr = {5, 2, 6, 7, 4, 8, 11, 36, 42};
        binaryTree.addElements(arr);
        System.out.println(binaryTree.getNumberOfElements());
        System.out.println(Arrays.toString(binaryTree.getSortedTreeAsc()));
        System.out.println(Arrays.toString(binaryTree.getSortedTreeDesc()));
    }
}
