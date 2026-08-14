class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int counter=0;
        //Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(counter==0){
                //st.push(s.charAt(i));
                counter++;
            }else if(counter==1){
                if(s.charAt(i)=='('){
                    counter++;
                    //st.push(s.charAt(i));
                    res.append(s.charAt(i));
                }
                else{
                    counter--;
                    //st.pop();
                    //if(counter!=1)res.append(s.charAt(i));
                }
                
            }else{
                if(s.charAt(i)=='('){
                    counter++;
                    //st.push(s.charAt(i));
                    res.append(s.charAt(i));
                }
                else{
                    counter--;
                    //st.pop();
                    //if(counter!=1)
                    res.append(s.charAt(i));
                }
                
            }
            // if(counter==0){
            //     st.pop();
            // }
        }
        return res.toString();
    }
}