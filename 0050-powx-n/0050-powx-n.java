class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n==0)return 1;
        return power(x,N);
    }
    public double power(double x,long N){
        if(N==0) return 1;
        if(N==1)return x;
        if(N>0){
            if(N%2==0){
                return power(x*x,N/2);
            }else{
                return x*power(x,N-1);
            }
        }else{
            return 1.0/power(x,-N);
        }
    }
}