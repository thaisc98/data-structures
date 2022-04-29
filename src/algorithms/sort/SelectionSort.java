package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int x = 0; x < array.length; x++) {
            int mindIndex = x;
            for (int y = x + 1; y < array.length; y++) {
                if(array[y] < array[mindIndex]){
                    mindIndex = y;
                }
            }
            //swap
            if(x != mindIndex){
                int temp = array[x];
                array[x] = array[mindIndex];
                array[mindIndex] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {4,2,6,5,1,3};
        System.out.println("Before selection sort: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("After selection sort: " + Arrays.toString(array));
    }
}
