package datastructures.tree;

public class BinarySearchTree {

    Node root; // point at the top pf the node

    // don't need the constructor because can have a root null

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value =  value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            // left
            if (newNode.value < temp.value) {
                // open
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                // not open
                temp = temp.left; // moves te temporal to down
            } else {
                //right
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value){
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

}


