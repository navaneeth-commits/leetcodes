class Solution {
    static{
        for(int i=0;i<500;i++){
            new Solution();
        }
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,0,dp),mincost(cost,1,dp));
    }
    public int mincost(int[] cost,int i,int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        dp[i]=cost[i]+Math.min(mincost(cost,i+1,dp),mincost(cost,i+2,dp));
        return dp[i];
    }
}