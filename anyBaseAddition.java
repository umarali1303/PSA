import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int ans=0;
       int p=1;
       int c=0;
       while(n1>0 || n2>0 || c>0){
           int temp1=n1%10;
           int temp2=n2%10;
           n1=n1/10;
           n2=n2/10;
           int temp3=temp1+temp2+c;
           ans+=(temp3%b)*p;
           c=temp3/b;
           p=p*10;
       }
       return ans;

   }
  }
