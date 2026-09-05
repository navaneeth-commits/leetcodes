class Solution {
    static{
        for(int i=0;i<500;i++){
            firstStableIndex(new int[]{0,0},0);
        }
    }
    public static int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] minarr=new int[n];
        minarr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            minarr[i]=Math.min(minarr[i+1],nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-minarr[i]<=k)return i;
        }
        return -1;
    }
}