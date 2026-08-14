class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int counter=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(counter==0){
                counter++;
            }else if(counter==1){
                if(s.charAt(i)=='('){
                    counter++;
                    res.append(s.charAt(i));
                }
                else{
                    counter--;
                }
                
            }else{
                if(s.charAt(i)=='('){
                    counter++;
                    res.append(s.charAt(i));
                }
                else{
                    counter--;
                    res.append(s.charAt(i));
                }
                
            }
        }
        return res.toString();
    }
}