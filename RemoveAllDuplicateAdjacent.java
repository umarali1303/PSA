class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()>0){
                if(ch==st.peek()){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        }
        for(int i=0;i<st.size();i++){
            s1+=st.elementAt(i);
        }
        
        return s1;
    }
}
