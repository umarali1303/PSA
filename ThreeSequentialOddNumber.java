class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        Arrays.sort(arr);
        int p1=0,ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0 && p1==0){
                p1=arr[i];
                ans++;
            }
            else if(arr[i]%2!=0 && arr[i]==p1+2){
                p1=arr[i];
                ans++;
                if(ans==3)
                    return true;
            }
            else if(arr[i]%2!=0 && arr[i]!=p1+2){
                ans=1;
                p1=arr[i];
            }
        }
        return false;
    }
}
