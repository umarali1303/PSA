class Solution {
    public int numIdenticalPairs(int[] nums) {
        int x=nums.length;
        int ans=0;
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
                if(nums[i]==nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}
