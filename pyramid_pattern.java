public class Main
{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<(n*2)-1;j++){
		        if((n-2-i)<j && j<(n+i)){
		            System.out.print("*");
		        }
		        else{
		             System.out.print(" ");
		        }
		    }
		    System.out.println("");
		}
	}
}
