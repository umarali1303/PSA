class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        int x=-1;
        for(int j=0;j<n;j+=2){
            x=-1;
            for(int k=j;k<n;k++){
                if(x>=0){
                    sum+=arr[k]-arr[x]; 
                }
                else{
                    sum+=arr[k];
                }
               x+=1;
            }
        }
        return sum;
    }
}
