class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int x=nums.length;
        int[] ar=new int[x];
        for(int i=0;i<x;i++){
            int ans=0;
            int value=nums[i];
            for(int j=0;j<x;j++){ 
                if(value>nums[j]){
                    ++ans;
                }
            }
            ar[i]=ans;
        }
        return ar;
    }
}
