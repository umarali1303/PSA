class Solution {
    public int thirdMax(int[] nums) {
        long ans2=Long.MIN_VALUE;
        long ans3=Long.MIN_VALUE;
        long ans1=Long.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length>2){
        for(int i=0;i<nums.length;i++){
            if(ans1<nums[i]){
                ans3=ans2;
                ans2=ans1;
                ans1=nums[i];
            }
            else if(ans2<nums[i] && ans1!=nums[i]){
                ans3=ans2;
                ans2=nums[i];
            }
            else if(ans3<nums[i] && ans2!=nums[i] && ans1!=nums[i]){
                ans3=nums[i];
            }
            }
        }
        else if(nums[0]>nums[1]){
            return nums[0];
        }
        else{
            return nums[1];
        }
        
        if(ans3==Long.MIN_VALUE)
        {
            return (int)ans1;
        }
        return (int)ans3;
    }
}
