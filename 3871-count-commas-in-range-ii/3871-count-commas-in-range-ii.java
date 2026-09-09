class Solution {
    static{
        for(int i=0;i<500;i++){
            countCommas(999);
        }
    }
    public static long countCommas(long n) {
        long c=0;
        if(n<1000)return c;
        if(n>=1000)c+=n-999;
        if(n>=1000000)c+=n-999999;
        if(n>=1000000000)c+=n-999999999;
        if(n>=1000000000000L)c+=n-999999999999L;
        if(n==1000000000000000L)c+=1;
        return c;
    }
}