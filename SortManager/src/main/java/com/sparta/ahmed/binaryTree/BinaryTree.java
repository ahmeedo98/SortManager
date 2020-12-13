package com.sparta.ahmed.binaryTree;

import java.util.ArrayList;

import com.sparta.ahmed.exceptions.ChildNotFoundException;
import com.sparta.ahmed.sorters.Sorter;

public class BinaryTree implements BinaryTreeInterface, Sorter {
    private final Node rootNode;
    private int numOfElements = 0;
    ArrayList<Integer> sortedTree = new ArrayList<Integer>();

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    //we don't want the user to deal with the node
    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
        numOfElements++;
    }

    private void addNodeToTree(Node node, int element) {
        if (element == node.getValue()) return;

        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }


    }

    public Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    public ArrayList<Integer> inOrder(Node node) {
        if (node == null) {
            return null;
        }

        inOrder(node.getLeftChild());
        sortedTree.add(node.getValue());
        inOrder(node.getRightChild());
        return sortedTree;
    }

    public ArrayList<Integer> descOrder(Node node) {
        if (node == null) {
            return null;
        }

        descOrder(node.getRightChild());
        sortedTree.add(node.getValue());
        descOrder(node.getLeftChild());
        return sortedTree;
    }

    public String getName(){
        return "Binary Tree Sorter";
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public void addElements(int[] elements) {
        for (int value : elements) {
            addElement(value);
        }
    }

    @Override
    public int getNumberOfElements() {
        return numOfElements;
    }

    @Override
    public boolean findElement(int value) {
        if (findNode(value) != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (findNode(element).isLeftChildEmpty()) {
            throw new ChildNotFoundException();
        }

        return findNode(element).getLeftChild().getValue();

    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (findNode(element).isRightChildEmpty()) {
            throw new ChildNotFoundException();
        }
        return findNode(element).getRightChild().getValue();
    }

    @Override
    public int[] getSortedTreeAsc() {
        ArrayList<Integer> sortedTreeList;
        sortedTreeList = inOrder(rootNode);
        int[] sortedTree = new int[sortedTreeList.size()];
        for (int i = 0; i <sortedTreeList.size() ; i++) {
            sortedTree[i] = sortedTreeList.get(i);
        }

        return sortedTree;
    }

    @Override
    public int[] getSortedTreeDesc() {
        ArrayList<Integer> sortedTreeList;
        sortedTreeList = descOrder(rootNode);
        int[] sortedTreeDesc = new int[sortedTreeList.size()];
        for (int i = 0; i <sortedTreeList.size() ; i++) {
            sortedTreeDesc[i] = sortedTreeList.get(i);
        }
        return sortedTreeDesc;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        addElements(arrayToSort);
        return getSortedTreeAsc();
    }
}
