class Solution {
    public int search(int[] nums, int target) {
        int i=1;
        int peak=0;
        while(i<nums.length){
            if(nums[i-1]>nums[i]){
                peak=i-1;
                break;
            }else{
                peak=i;
            }
            i++;
        }
        int left=0,right=0;
        if(target>=nums[0]){
            left=0;
            right=peak;
        }else{
            left=peak+1;
            right=nums.length-1;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}