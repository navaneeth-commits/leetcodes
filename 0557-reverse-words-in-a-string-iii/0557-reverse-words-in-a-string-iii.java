class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                word.append(ch);
            }else{
                res.append(word.reverse());
                res.append(' ');
                word=new StringBuilder();
            }
        }
        res.append(word.reverse());
        return res.toString();
    }
}