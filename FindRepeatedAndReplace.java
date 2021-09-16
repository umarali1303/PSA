public class MyClass {
    public static void main(String args[]) {
      int[] arr= new int[]{2,2,3,4,5};
      for(int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1]){
              if(arr[i+1]-arr[i]!=1){
                  arr[i]=arr[i+1]-1;
              }
              else{
                  arr[i-1]=arr[i]-1;
              }
          }
      }
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
}
}
