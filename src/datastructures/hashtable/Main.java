package datastructures.hashtable;

import datastructures.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        HashTable ht = new HashTable();
        ht.set("nails", 100);
        ht.set("tile", 100);
        ht.set("lumber", 80);
        ht.set("bolts", 200);
        ht.set("screws", 140);
        ht.printTable();

    }
}
