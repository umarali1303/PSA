class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=image[i][j];
                if(image[i][n-1-j]==0){
                image[i][j]=1;
                }
                else{
                  image[i][j]=0;  
                }
                if(temp==0){
                   image[i][n-1-j]=1; 
                }
                else{
                    image[i][n-1-j]=0;
                }
            }
        }
        if(n%2!=0){
             for(int i=0;i<n;i++){
                if(image[i][n/2]==0){
                    image[i][n/2]=1;
                }
                else{
                    image[i][n/2]=0;
                }
            }
        }
        return image;
    }
}
