class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        boolean b=false,b2=false;
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    b=true;
                    
                }
                if(b && nums2[j]>nums1[i]){
                    arr[k]=nums2[j];
                    k++;
                    b2=true;
                    break;
                }
            }
            if(!b2){
                    arr[k]=-1;
                    k++;
                }
            b=false;
            b2=false;
        }
        return arr;
    }
}
