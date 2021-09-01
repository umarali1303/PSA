class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int ans=1;
        int[] nums2= new int[nums.length];
        nums2[0]=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
               nums2[ans]=nums[i+1];
                ans++;
            }
        }
        for(int j=0;j<nums2.length;j++){
            nums[j]=nums2[j];
        }
        return ans;
    }
}
