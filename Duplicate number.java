class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> ht = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(nums[i])){
                return true;
            }
            else{
            ht.put(nums[i],i);
         }
        }
          return false;
    }
}
