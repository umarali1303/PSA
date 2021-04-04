class Solution {
    public int[] sortArrayByParity(int[] A) {
       int p1=0,p2=0;
        while(p2<A.length){
            if(A[p2]%2==0){
                int temp=A[p2];
                A[p2]=A[p1];
                A[p1]=temp;
                p1+=1;
                p2+=1;
            }
            else{
                p2+=1;
            }
        }
        return A;
    }
}
