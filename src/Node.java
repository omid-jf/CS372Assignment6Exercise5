/*
 * This file is part of the CS372Assignment6Exercise5 project.
 *
 * Author: Omid Jafari - omidjafari.com
 * Copyright (c) 2018
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

public class Node {

    // Instance variables
    private int position;
    private int value;
    private char color;
    private Node leftChild;
    private Node rightChild;
    private int leftChildPos;
    private int rightChildPos;

    // Constructor
    public Node(int position, int value, char color) {
        this.position = position;
        this.value = value;
        this.color = color;
        this.leftChild = null;
        this.rightChild = null;
        this.leftChildPos = 2 * position;
        this.rightChildPos = 2 * position + 1;
    }

    // Getters
    public int getPosition() {
        return this.position;
    }

    public int getValue() {
        return this.value;
    }

    public char getColor() {
        return this.color;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int getLeftChildPos() {
        return this.leftChildPos;
    }

    public int getRightChildPos() {
        return this.rightChildPos;
    }

    // Setters
    public void setLeftChild(Node x) {
        this.leftChild = x;
    }

    public void setRightChild(Node x) {
        this.rightChild = x;
    }
}
