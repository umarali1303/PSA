class Solution {
    public int maximumWealth(int[][] accounts) {
        int x=accounts.length;
        int x1=accounts[0].length;
        int ans=0;
        for(int i=0;i<x;i++){
            int sum=0;
            for(int j=0;j<x1;j++){
                sum=sum+accounts[i][j];
            }
            if(ans<sum){
                ans=sum;
            }
        }
     
    return ans;
    }
}
