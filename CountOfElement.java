// given an array count number of element having at least one element greater than itself.
package Array;
import java.util.Scanner;
public class CountOfElement {
    public static void main(String[] args) {
        int []arr={-3,4,5,6,7,8};
        int n=arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                count++;
            }
        }
        System.out.println("Number of element greater than itself: " + count);
        
    }
}