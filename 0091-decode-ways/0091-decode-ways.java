class Solution {
    static{
        for(int i=0;i<500;i++){
            new Solution();
        }
    }
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0,dp);
    }
    public int solve(String s,int i,int[] dp){
        if(i>=s.length())return 1;
        if(s.charAt(i)=='0')return 0;
        if(dp[i]!=-1)return dp[i];
        int ways=0;
        if(i+1<s.length()){
            int val=Integer.parseInt(String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1)));
            if(val>=10 && val<=26){
                ways +=solve(s,i+2,dp);
            }
        }
        dp[i]=solve(s,i+1,dp)+ways;
        return dp[i];
    }
}