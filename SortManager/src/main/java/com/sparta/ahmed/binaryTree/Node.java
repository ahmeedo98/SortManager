package com.sparta.ahmed.binaryTree;

public class Node {
    //write your code as if someone else is going to use it.
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
        //no need for children, since it might not have any
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeftChildEmpty(){
        return leftChild == null;
    }

    public boolean isRightChildEmpty(){
        return rightChild == null;
    }


}
