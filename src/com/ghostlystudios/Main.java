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



        Node leftRightRight = new Node(null, null, "a");
        Node leftRightLeft = new Node(null, null, "u");
        Node left4 = new Node(null, null, "d");
        Node leftLeftLeft = new Node(left4, null, "p");
        Node rightRight = new Node(null, null, "q");
        Node leftLeft = new Node( leftLeftLeft, null, "j");
        Node leftRight = new Node( leftRightLeft, leftRightRight, "f");
        Node rootLeft = new Node( leftLeft, leftRight, "h");
        Node rootRight = new Node( null, rightRight, "s");
        Node root = new Node(rootLeft, rootRight, "g");


        new BreadthFirstTreeTraversal(root);
        System.out.println();
        new DepthFirstTreeTraversal(root);
    }
}
