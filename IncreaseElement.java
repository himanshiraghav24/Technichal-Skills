package Array;
// Given an integer A of size N in one second you can increase the value of one element by 1.
// Find the minimum time in seconds to make all elements of the array equal.
// Observation: To minimum the time,make All elemnts equal to the maximum element in the array.
// pseudocode:1. FInd the maximum element in the array.
// For every element calculate how much it needs to be increased to reach the maximum.
// 3. Sum of all those difference.
public class IncreaseElement {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3};
        int n = arr.length;

        int max = arr[0];
        int time = 0;

    
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            time += max - arr[i];
        }

        System.out.println(time);
    }
}
