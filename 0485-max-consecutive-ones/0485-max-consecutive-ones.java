class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                left=i+1;
            }else{
                max=Math.max(max,i-left+1);
            }
        }
        return max;
    }
}