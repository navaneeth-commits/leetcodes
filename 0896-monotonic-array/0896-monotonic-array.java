class Solution {
    public boolean isMonotonic(int[] nums) {

        int n = nums.length;

        int i = 1;

        while(i < n && nums[i-1]<= nums[i]) i++;

        if(i == n) return true;

        i = 1;

            while(i<n && nums[i-1] >= nums[i]) i++;
        

        if(i == n) return  true;

        return false;


    }

}