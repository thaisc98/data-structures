package algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int x = pivotIndex + 1; x <= endIndex; x++) {
            if (array[x] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, x);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void quickSort(int[] array){
        quickSortHelper(array, 0, array.length - 1);
    }

    public static void quickSortHelper(int[] array, int left, int right){
        if(left < right){
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arrayOne = {4, 6, 1, 7, 3, 2, 5};
        quickSort(arrayOne);
        System.out.println(Arrays.toString(arrayOne));
    }
}
