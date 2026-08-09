class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int prev=0;
        int cur=0;
        for(int i=n-1;i>=0;i--){
            int current=cost[i]+ Math.min(cur,prev);
            prev=cur;
            cur=current;
        }
        return Math.min(prev,cur);
    }
}