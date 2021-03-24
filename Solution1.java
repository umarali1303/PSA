class Solution1 {
    public int[] runningSum(int[] nums) {
        int x=nums.length;
        int[] num2=new int[x];
        for(int i=0;i<x;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            num2[i]=sum;
        }
        return num2;
        
    }
}