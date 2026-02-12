// WAp to find sum of every column of a matrix
package Matrix;
import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();  
        System.out.print("Enter number of column:");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.print("Enter elemnts of array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        int sum=0;
        for(int j=0;j<cols;j++){
            sum=0;
            for(int i=0;i<rows;i++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of column "+(j+1)+":"+sum);
        }
    }
    
}
