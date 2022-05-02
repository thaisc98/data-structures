package algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] arrayOne, int[] arrayTwo) {
        int[] combine = new int[arrayOne.length + arrayTwo.length];
        int index = 0, x = 0, y = 0;

        while (x < arrayOne.length && y < arrayTwo.length) {
            if (arrayOne[x] < arrayTwo[y]) {
                combine[index] = arrayOne[x];
                index++;
                x++;
            } else {
                combine[index] = arrayTwo[y];
                index++;
                y++;
            }
        }

        while (x < arrayOne.length) {
            combine[index] = arrayOne[x];
            index++;
            x++;
        }

        while (y < arrayTwo.length) {
            combine[index] = arrayTwo[y];
            index++;
            y++;
        }

        return combine;
    }

    public static int[] mergeSort(int[] arrayOne) {
        if(arrayOne.length == 1) return arrayOne;

        int mid = arrayOne.length/2;
        int[] left = Arrays.copyOfRange(arrayOne, 0, mid);
        int[] right = Arrays.copyOfRange(arrayOne, mid, arrayOne.length);

        return merge(mergeSort(left),mergeSort(right));
    }

    public static void main(String[] args) {
        int[] arrayOne = {3, 1, 4, 2};

        System.out.println("After merge sort: "
                + Arrays.toString(mergeSort(arrayOne)));
    }
}
