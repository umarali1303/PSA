class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(st.size()>0){
                    s1+="(";
                }
                st.push(ch);
            }
            
            else {
                st.pop();
                if(st.size()>0){
                    s1+=")";
                }
            }
            
        }
        
        return s1;
    }
}
