package datastructures.tree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("root : " + bst.root);

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);


        System.out.println(bst.contains(27));
        System.out.println(bst.contains(17));

        //System.out.println(bst.root.left.right.value);

        System.out.println(bst.BFS());
        System.out.println(bst.DFSPreOrder());
        System.out.println(bst.DFSPostOrder());
        System.out.println(bst.DFSInOrder());

    }
}
