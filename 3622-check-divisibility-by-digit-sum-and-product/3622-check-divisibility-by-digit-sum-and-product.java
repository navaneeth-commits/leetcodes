class Solution {
    public boolean checkDivisibility(int n) {
        int N=n;
        int sum=0;
        int prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }
        return N%(sum+prod)==0;
    }
}