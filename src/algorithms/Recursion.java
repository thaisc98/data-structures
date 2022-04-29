package algorithms;

import datastructures.queue.Queue;

public class Recursion {

    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of number: " + factorial(4));
    }
}
