class Solution {
    public int climbStairs(int n) {
        return fibo(n);
    }
    public int fibo(int n){
        int i=0;
        int b=1;
        int a=0;
        int res=0;
        while(i<n){
            res=a+b;
            a=b;
            b=res;
            i++;
        }
        return b;
    }
}