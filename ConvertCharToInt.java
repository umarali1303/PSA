import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        List<Character> l=new ArrayList<Character>();
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
          do{
                int temp=value%10;
                l.add((char)(temp+97));
                value=value/10;
                if(value==0)
                l.add((char)97);
            }while(value>0);
        Collections.reverse(l);
        for(int i=0;i<l.size();i++){
        System.out.print(l.get(i));
        }
    }
}
