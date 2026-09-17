class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1)return n;
        if(n==2) return 1;
        int n1=0;
        int n2=1;
        int n3=1;
        int i=2;
        while(i<n){
            int res=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=res;
            i++;
        }
        return n3;
    }
}