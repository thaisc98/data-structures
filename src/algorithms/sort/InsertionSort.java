package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        //starts with the second element
        for (int x = 1; x < array.length; x++) {
            int temp = array[x];
            int y = x - 1;
            while (y > -1 && temp < array[y]) {
                array[y + 1] = array[y];
                array[y] = temp;
                y--;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {4,2,6,5,1,3};
        System.out.println("Before insertion sort: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("After insertion sort: " + Arrays.toString(array));
    }
}
