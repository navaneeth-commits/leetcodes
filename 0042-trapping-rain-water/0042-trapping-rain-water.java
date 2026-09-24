class Solution {
    public int trap(int[] heights) {
        int left=0;
        int leftmax=heights[left];
        int right=heights.length-1;
        int rightmax=heights[right];
        int water=0;
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,heights[left]);
                water+=leftmax-heights[left];
            }else{
                right--;
                rightmax=Math.max(rightmax,heights[right]);
                water+=rightmax-heights[right];
            }
        }
        return water;
    }
}