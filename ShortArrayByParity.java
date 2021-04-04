class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] arr=new int[A.length];
        int a=0,b=A.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                arr[a]=A[i];
                a+=1;
            }
           else{
               arr[b]=A[i];
               b-=1;
           } 
        }
            return arr;
    }
}
