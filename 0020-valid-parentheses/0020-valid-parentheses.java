class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(!st.isEmpty()){
                char c=st.peek();
                if(a=='(' || a=='{' || a=='['){
                    st.push(a);
                }else if(a==')'){
                    if(c=='(')st.pop();
                    else return false;
                }else if(a==']'){
                    if(c=='[')st.pop();
                    else return false;
                }else if(a=='}'){
                    if(c=='{')st.pop();
                    else return false;
                }
            }else{
                st.push(a);
            }
        }
        return st.isEmpty();
    }
}