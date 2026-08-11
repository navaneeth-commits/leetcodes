class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')i++;

        int sign=1;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        return solve(i,s,0,sign);
    }
    public int solve(int i,String s,long num,int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i)))return (int)(sign*num);
        num=num*10 + (int)(s.charAt(i)-'0');

        if(sign*num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign*num<=Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return solve(i+1,s,num,sign);
    }
}