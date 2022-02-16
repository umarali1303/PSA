import java.io.*;
import java.util.*;

public class Main{
    public static int find(int d,int ar[],int n){
        for(int i=0;i<n;i++){
            if(d==ar[i])
                return i;
        }
        return -1;
    }
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    int index=find(d,ar,n);
    System.out.println(index);
 }
}
