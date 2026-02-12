// WAP to find second largest element of the array
package Matrix;

public class SecondLargestElm {
     public static void main(String[] args) {
        int a[]={5,8,10,2,0};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int secondlargest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>secondlargest && a[i]!=max){
                secondlargest = a[i];
            }

        }
        System.out.println("Second largest "+secondlargest);

    }
    
    
}
