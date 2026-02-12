// WAP to sum of upper diagonal element of a matrix
// WAP to Sum of lower diagonal elemnt of a matrix
package Matrix;
import java.util.Scanner;

public class SumOfUpperDia {
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
        int upperSum=0;
        int loweSum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i<j){
                    upperSum+=arr[i][j];
                }
                else if(i>j){
                    loweSum+=arr[i][j];
                }
            }
        } 
        System.out.println("Sum of upper diagonal elements:"+upperSum);
        System.out.println("Sum of lower diagonal elements:"+loweSum); 
    }
    
}
