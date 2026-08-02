class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        if(n==0)return new int[]{-1,-1};
        int i=0;
        int j=n-1;
        int indone=-1;
        int indtwo=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                indone=mid;
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        i=0;
        j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                indtwo=mid;
                i=mid+1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return new int[]{indone,indtwo};
    }
}