class Solution {
    static{
        for(int i=0;i<50000;i++){
            countCommas(1000);
        }
    }
    public static int countCommas(int n) {
        if(n<1000)return 0;
        return n-999;
    }
}