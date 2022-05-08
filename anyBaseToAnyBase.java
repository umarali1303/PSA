import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans=0;
      int p=1;
     while(n>0){
       int temp=n%10;
       n=n/10;
       ans+=temp*p;
       p=p*sourceBase;
     }
     p=1;
     int ans1=0;
     while(ans>0){
       int temp=ans%destBase;
       ans=ans/destBase;
       ans1+=temp*p;
       p=p*10;
     }
     System.out.print(ans1);
   }   
  }
