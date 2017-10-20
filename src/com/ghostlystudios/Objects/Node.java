package com.ghostlystudios.Objects;

public class Node {

    public Node left;
    public Node right;
    public String value;
    public boolean visted = false;

    public Node(Node left, Node right, String value){
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
