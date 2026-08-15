class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=nums[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i]==0)count++;
            xor=xor^nums[i];
        }
        if(xor!=0)return n;
        else if(count==n-1)return 0;
        return n-1;
    }
}