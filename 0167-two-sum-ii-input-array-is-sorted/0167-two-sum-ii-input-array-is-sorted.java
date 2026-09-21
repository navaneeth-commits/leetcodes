class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==tar)return new int[]{left+1,right+1};
            else if(nums[left]+nums[right]>tar)right--;
            else if(nums[left]+nums[right]<tar)left++;
        }
        return new int[]{-1,-1};
    }
}