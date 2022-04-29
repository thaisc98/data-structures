package algorithms.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int x = array.length - 1; x > 0; x--) {
            for (int y = 0; y < x; y++) {
                if (array[y] > array[y + 1]) {
                    //swap the values
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array = {4,2,6,5,1,3};
        System.out.println("Before bubble sort: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After bubble sort: " + Arrays.toString(array));
    }
}
