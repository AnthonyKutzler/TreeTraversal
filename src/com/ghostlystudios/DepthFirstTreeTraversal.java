package com.ghostlystudios;

import com.ghostlystudios.Objects.Node;

import java.util.LinkedList;

public class DepthFirstTreeTraversal {

    DepthFirstTreeTraversal(Node rootNode){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(rootNode);

        while(queue.size() > 0){
            Node currentNode = queue.poll();
            if(currentNode.right != null)
                queue.addFirst(currentNode.right);
            if(currentNode.left != null)
                queue.addFirst(currentNode.left);
            System.out.print(currentNode.value + " ");

        }
    }
}
