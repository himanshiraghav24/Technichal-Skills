package Array;
// Given an array of integer A find and return the product array of the same size 
// where the ith element of the product array will be equal to the product of all the element 
// divided by the ith element of the array.   

public class ProductArray {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4,5};
        int n = A.length;

        int[] P = new int[n];
        int Product = 1;

        
        for (int i = 0; i < n; i++) {
            Product = Product * A[i];
        }

        
        for (int i = 0; i < n; i++) {
            P[i] = Product / A[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(P[i] + " ");
        }
    }
}
