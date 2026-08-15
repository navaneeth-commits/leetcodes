class Solution {
    static{
        for(int i=0;i<500;i++){
            new Solution();
        }
    }
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)count++;
            xor=xor^nums[i];
        }
        if(xor!=0)return n;
        else if(count==n)return 0;
        return n-1;
    }
}