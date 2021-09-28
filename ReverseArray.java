class Solution {
    public void rotate(int[] nums, int k) {
        int index;
        if(nums.length>k)
            index=nums.length-k;
        else{
                k=k%nums.length;
                index=nums.length-k;
        }
        int j=0;
        int[] arr=new int[k];
        for(int i=index;i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(index!=0){
                nums[i]=nums[index-1];
                index--;
            }
            else{
                nums[i]=arr[i];
            }
        }
    }
}
