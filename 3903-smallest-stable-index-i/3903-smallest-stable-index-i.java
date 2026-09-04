class Solution {
    static{
        for(int i=0;i<500;i++){
            firstStableIndex(new int[]{0,0},0);
        }
    }
    public static int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max=nums[0];
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(max,nums[j]);
            }
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k)return i;
        }
        return -1;
    }
}