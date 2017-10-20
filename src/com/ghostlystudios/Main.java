package com.ghostlystudios;

import com.ghostlystudios.Objects.Node;

public class Main {

    public static void main(String[] args) {
        /*

                   [g]
                [h]    [s]
              [j] [f]    [q]
             [p] [u][a]
            [d]

        */
        Node root = new Node("g");
        root.left = new Node("h");
        root.right = new Node("s");
        root.left.left = new Node("j");
        root.left.right = new Node("f");
        root.left.left.left = new Node("p");
        root.left.left.left.left = new Node("d");
        root.left.right.left = new Node("u");
        root.left.right.right = new Node("a");
        root.right.right = new Node("q");


        new BreadthFirstTreeTraversal(root);
        System.out.println();
        new DepthFirstTreeTraversal(root);
    }
}
