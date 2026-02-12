// Write a Java program to read a matrix from the user, display the matrix, 
//  and find the sum of its diagonal elements.
package Matrix;
import java.util.Scanner;

public class OperationOfMatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter number of column:");
        int cols = sc.nextInt();
        int [][]matrix = new int [rows][cols];
        System.out.print("Enter number of elemnts:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");

        }
        System.out.print("The sum of diagonal matrix is : ");
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
            
        }
        System.out.print(sum);

    }
    
}
