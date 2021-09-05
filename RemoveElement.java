class Solution {
    public int removeElement(int[] nums, int val) {
        int p1=0,p2=0;
        for(int i=0;i<nums.length;i++){
                if(nums[p1]!=val){
                    p1++;
                    p2++;
                }
            else{
                if(nums[p2]!=val){
                    int temp=nums[p1];
                    nums[p1]=nums[p2];
                    nums[p2]=temp;
                    p1++;
                    p2++;
                }
                else{
                    p2++;
                }
            }
            }
        return p1;
        }
    }
