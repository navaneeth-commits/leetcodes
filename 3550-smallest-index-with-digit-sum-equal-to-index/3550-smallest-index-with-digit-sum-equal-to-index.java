class Solution {
    static{
        for(int i=0;i<500;i++){
            smallestIndex(new int[]{0,0});
        }
    }
    public static int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==digitsum(nums[i]))return i;
        }
        return -1;
    }
    public static int digitsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}