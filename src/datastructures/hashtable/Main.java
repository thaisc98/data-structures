package datastructures.hashtable;

import datastructures.tree.BinarySearchTree;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashTable ht = new HashTable();
        ht.set("nails", 100);
        ht.set("tile", 100);
        ht.set("lumber", 80);
        ht.set("bolts", 200);
        ht.set("screws", 140);

        ht.printTable();

        System.out.println("Result of get: ");
        System.out.println(ht.get("lumber"));
        System.out.println(ht.get("cucara")); // dosnet exist

        System.out.println("Result of keys: ");
        System.out.println(ht.keys());

        // IQ
        int[] arrayOne = {1,3,5};
        int[] arrayTwo = {2,4,5};
        Calendar calendarNow = Calendar.getInstance();
        System.out.println(itemInCommon(arrayOne, arrayTwo));
        Calendar calendarLater = Calendar.getInstance();
        System.out.println("Time in seconds: " +
                (calendarLater.getTimeInMillis() - calendarNow.getTimeInMillis()));

        Calendar calendarNowHT = Calendar.getInstance();
        System.out.println(itemInCommonUsingHashTable(arrayOne, arrayTwo));
        Calendar calendarLaterHT = Calendar.getInstance();
        System.out.println("Time in seconds with hash table: " +
                (calendarLaterHT.getTimeInMillis() - calendarNowHT.getTimeInMillis()));
    }

    // O(n^2) - nested for loop
    public static boolean itemInCommon(int[] arrayOne, int[] arrayTwo){
        for(int x : arrayOne){
            for(int y: arrayTwo){
                if(x == y) return true;
            }
        }
        return false;
    }

    // O(2n) = O(n)
    public static boolean itemInCommonUsingHashTable(int[] arrayOne, int[] arrayTwo){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int x: arrayOne){
            hashMap.put(x, true);
        }

        for(int y: arrayTwo){
            if(hashMap.get(y) != null) return true;
        }
        return false;
    }
}
