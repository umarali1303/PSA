class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int r=points.length;
        int a=0,b=0,ans=0;
        for(int i=0;i<r-1;i++){
         a=Math.abs(points[i][0]-points[i+1][0]);
         b=Math.abs(points[i][1]-points[i+1][1]);
         ans+=Math.max(a,b);
        }
    return ans;
    }
}
