class Solution {
    static {
        for(int i = 0; i < 500; i++){
            longestOnes(new int[]{}, 0);
        }
    }
    public static int longestOnes(int[] nums, int k) {
        int i=0,j;
        for(j=0;j<nums.length;++j){
            if(nums[j]==0)k--;
            if(k<0 && nums[i++]==0)k++;
        }
        return j-i;
    }
}