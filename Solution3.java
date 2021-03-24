class Solution3 {
    public int[] shuffle(int[] nums, int n) {
        int x=nums.length;
        int[] nums2=new int[x];
        int k=0;
        for(int i=0;i<n;i++){
            nums2[k++]=nums[i]; 
            nums2[k++]=nums[(n+i)];
            
        }
        return nums2;
    }
}