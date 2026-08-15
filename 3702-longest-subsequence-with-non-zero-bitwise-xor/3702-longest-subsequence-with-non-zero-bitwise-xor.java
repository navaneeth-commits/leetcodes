class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=nums[0];
        if(Arrays.stream(nums).allMatch(x -> x == 0))return 0;
        for(int i=1;i<n;i++){
            xor=xor^nums[i];
        }
        if(xor!=0)return n;
        else return n-1;
    }
}