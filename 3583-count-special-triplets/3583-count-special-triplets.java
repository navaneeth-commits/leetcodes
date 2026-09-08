class Solution {
    public int specialTriplets(int[] nums) {
        long count=0;
        int n=nums.length;
        Map<Integer,Integer> set1=new HashMap<>();
        set1.put(nums[0],1);
        Map<Integer,Integer> set2=new HashMap<>();
        for(int i=2;i<n;i++)set2.put(nums[i],set2.getOrDefault(nums[i],0)+1);
        for(int j=1;j<n-1;j++){
            int left=set1.getOrDefault(nums[j]*2,0);
            int right=set2.getOrDefault(nums[j]*2,0);
            if(left>0 && right>0){
                count= (count+((long)left*right)% 1000000007)%1000000007;
            }
            set1.put(nums[j],set1.getOrDefault(nums[j],0)+1);
            set2.put(nums[j+1],set2.getOrDefault(nums[j+1],0)-1);
        }
        return (int)count;
    }
}