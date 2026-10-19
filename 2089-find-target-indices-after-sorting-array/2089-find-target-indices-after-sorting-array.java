class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int smallcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }else if(nums[i]<target){
                smallcount++;
            }
        }
        List<Integer> list=new ArrayList<>();
        int num=smallcount-1+count;
        for(int i=smallcount;i<num+1;i++){
            list.add(i);
        }
        return list;
    }
}