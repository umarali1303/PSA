class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(index[i]>=i){
                ar[index[i]]=nums[i];
            }
            else{
                int x=ar[index[i]];
                ar[index[i]]=nums[i];
                for(int j=index[i]+1;j<=i;j++){
                    int temp=ar[j];
                    ar[j]=x;
                    x=temp;
                }
            }
        }
        return ar;
    }
}
