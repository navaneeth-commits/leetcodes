class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        Arrays.fill(res,-2000000000);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max)continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    res[i]=nums[j];
                    break;
                }
            }
            if(res[i]==-2000000000){
                for(int j=0;j<=i;j++){
                    if(nums[j]>nums[i]){
                        res[i]=nums[j];
                        break;
                    }
                }
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==-2000000000)res[i]=-1;
        }
        return res;
    }
}