class Solution2 {
    public int[] runningSum(int[] nums) {
        int x=nums.length;
        
        for(int i=1;i<x;i++){
            
                nums[i]=nums[i-1]+nums[i];
                 
        }
       return nums;
        
    }
}