package datastructures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DAArrays {

    public int secondSmallest(){
        int[] array = {10, 20, 29, 1, 0, 57};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array : " + Arrays.toString(array));
        return array[1];
    }

    public static int firstNonRepetead(){

        int[] elements = { 1, 1, 3, 4, 3, 4,2 };
        Set<Integer> singleSet = new HashSet<>();
        Set<Integer> repeatedSet = new HashSet<>();

        for (int e : elements) {
            if (repeatedSet.contains(e)) {
                continue;
            }
            if (singleSet.contains(e)) {
                singleSet.remove(e);
                repeatedSet.add(e);
            } else {
                singleSet.add(e);
            }
        }

        for (int e : elements) {
            if (singleSet.contains(e)) {
                return e;
            }
        }
        return -1;
    }


    // Function to merge two sorted arrays X[] and Y[]
    public static int[] merge(int[] X, int[] Y)
    {
        int k = 0, i = 0, j = 0;
        int[] aux = new int[X.length + Y.length];

        // while there are elements in the first and second arrays
        while (i < X.length && j < Y.length)
        {
            if (X[i] <= Y[j]) {
                aux[k++] = X[i++];
            }
            else {
                aux[k++] = Y[j++];
            }
        }

        // copy remaining elements
        while (i < X.length) {
            aux[k++] = X[i++];
        }

        while (j < Y.length) {
            aux[k++] = Y[j++];
        }

        return aux;
    }

    static int insertSorted(int arr[], int n, int key, int capacity)
    {
        if (n >= capacity)
            return n;

        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i + 1] = arr[i];

        arr[i + 1] = key;
        return (n + 1);
    }


    public static void main(String args[]) {
        System.out.println(firstNonRepetead());

        int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };

        int[] aux = merge(X, Y);

        System.out.println("First Array : " + Arrays.toString(X));
        System.out.println("Second Array: " + Arrays.toString(Y));
        System.out.println("After Merge : " + Arrays.toString(aux));

        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;

        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key
        n = insertSorted(arr, n, key, capacity);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }



}
