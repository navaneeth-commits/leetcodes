class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            boolean isok=true;
            for(int j=i+1;j<i+k;j++){
                if(nums[j-1]+1!=nums[j]){
                    isok=false;
                    break;
                }
            }
            if(isok){
                res[i]=nums[i+k-1];
            }else{
                res[i]=-1;
            }
        }
        return res;
    }
}