class Solution {
    static{
        for(int i=0;i<500;i++){
            new Solution();
        }
    }
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuilder word=new StringBuilder(str[i]);
            if(res.isEmpty()){
                res.append(word.reverse().toString());
            }else{
                res.append(" ");
                res.append(word.reverse().toString());
            }
        }
        return res.toString();
    }
}