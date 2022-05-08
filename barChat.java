import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    int max=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(arr[i]>max)
        max=arr[i];
    }
    for(int i=0;i<max;i++){
        for(int j=0;j<n;j++){
            int temp=max-arr[j];
            if(temp<=i){

             System.out.print("*\t");

            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println("");
    }
 }

}
