package com.ghostlystudios;

import com.ghostlystudios.Objects.Node;

import java.util.LinkedList;

public class BreadthFirstTreeTraversal {

    BreadthFirstTreeTraversal(Node rootNode){

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(rootNode);
        while(queue.size() > 0){
            Node currentTreeNode = queue.poll();
            if(currentTreeNode.left != null)
                queue.add(currentTreeNode.left);
            if(currentTreeNode.right != null)
                queue.add(currentTreeNode.right);

            System.out.print(currentTreeNode.value + " ");
        }

    }

}
