// WAP to find sum of every row of a matrix
package Matrix;
import java.util.Scanner;

public class SumOfRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
  
        int arr[][] = new int[rows][cols];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int sum = 0;   // reset sum for each row
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }
}
