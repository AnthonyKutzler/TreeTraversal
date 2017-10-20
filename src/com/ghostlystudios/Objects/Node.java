package com.ghostlystudios.Objects;

public class Node {

    public Node left;
    public Node right;
    public String value;

    public Node(String value){
        this.value = value;
        this.left = this.right = null;
    }
}
