class Main
{   
    static final int MAX=1000;
    int top=-1;
    int[] arr=new int [MAX];
    boolean push(int x){
        if(top>MAX){
            System.out.print("stck overflow");
            return false;
        }
        
        else{
            arr[++top]=x;
            return true;
        }
    }
    
    int pop(){
        if(top<0){
            System.out.print("stack underflow");
            return 0;
        }
        
        else{
            return arr[top--];
        }
    }
     int peek(){
        if(top<0){
            System.out.print("stack underflow");
            return 0;
        }
        
        else{
            return arr[top];
        }
    }
    
    boolean isEmpty(){
        if(top<0){
            return true;
        }
        
        else
                return false;
    }
    
    void print(){
       
                for(int i=top;i>=0;i--){
                   System.out.print(arr[i]);
             
        }
    }
	public static void main(String[] args) {
		Main s=new Main();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.print(s.peek());
		System.out.print(s.pop());
		s.print();
	}
}
