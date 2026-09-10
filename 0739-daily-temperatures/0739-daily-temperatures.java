class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                int prev=st.pop();
                res[prev]=i-prev;
            }
            st.push(i);
        }
        return res;
    }
}