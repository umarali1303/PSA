class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l=new ArrayList();
        int x=candies[0];
        for(int i=1;i<candies.length;i++){
            if(x<candies[i]){
                x=candies[i];
            }
        }
       for(int j=0;j<candies.length;j++){
           if((candies[j]+extraCandies)>=x){
               l.add(true);
           }
           else{
               l.add(false);
               }
       } 
        return l;
        
    }
}