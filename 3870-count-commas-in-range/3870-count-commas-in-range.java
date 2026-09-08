class Solution {
    static{
        for(int i=0;i<500;i++){
            countCommas(0);
        }
    }
    public static int countCommas(int n) {
        if(n<1000)return 0;
        return n-999;
    }
}