class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n=startTime.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(queryTime<=endTime[i]&&queryTime>=startTime[i]){
                ans+=1;
            }
        }
       return ans;
    }
}
