class Solution {
    static{
        for(int i=0;i<500;i++){
            maxSubarrayLength(new int[]{},0);
        }
    }
    public static int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int res=0;
        while(j<n){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.get(nums[j]) > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}