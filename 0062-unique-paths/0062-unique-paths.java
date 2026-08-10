class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,dp);
    }
    public int solve(int i,int j,int[][] dp){
        if(i>=dp.length || j>=dp[0].length)return 0;
        if(i == dp.length-1 && j == dp[0].length-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        dp[i][j]=solve(i+1,j,dp)+solve(i,j+1,dp);
        return dp[i][j];
    }
}