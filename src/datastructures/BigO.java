package datastructures;

public class BigO {

    public static void printBig_O_N(int n){
        for(int x = 0; x < n; x++){
            System.out.println(x);
        }
    }

    public static void printBig_O_2N(int n){
        for(int x = 0; x < n; x++){
            System.out.println(x);
        }

        for(int y = 0; y < n; y++){
            System.out.println(y);
        }
    }

    public static void printBig_O_N_SQUARE_2(int n){
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                System.out.println(x + " "+ y);
            }
        }
    }

    public static void printBig_O_N_cube(int n){
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                for(int z = 0; z < n; z++){
                    System.out.println(x + " " + y +" "+ z);
                }
            }
        }
    }

    public static void printBig_O_N_Dominant(int n){
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                System.out.println(x + " " + y);
            }
        }

        for(int z = 0; z < n; z++){
            System.out.println(z);
        }
    }

    public static int printBig_O_1(int n){
        return n + n;
    }

    /* This will be 0(a) + O(b) = O(a + B) */
    public static void printBig_0_Different_Inputs(int a, int b){
        for(int x = 0; x < a; x++){
            System.out.println(x);
        }

        for(int y = 0; y <  b; y++){
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        printBig_0_Different_Inputs(10,10);
    }
}
