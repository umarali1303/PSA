class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int n=highLimit-lowLimit+1;
        int ans;
        int[] arr2=new int[50];
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int temp=lowLimit;
            int sum=0;
            while(temp>=1){
                sum+=temp%10;
                temp=temp/10;
            }
            arr[i]=sum;
            arr2[sum]+=1;;
            lowLimit+=1;
        }
        ans=arr2[arr[0]];
        for(int i=1;i<n;i++){
           if(arr2[arr[i]]>ans){
               ans=arr2[arr[i]];
           }
        }
        return ans;
    }
}
