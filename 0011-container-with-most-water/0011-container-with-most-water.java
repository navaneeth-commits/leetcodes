class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1,maxarea=0;
        while(left<right){
            maxarea=Math.max(maxarea,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}