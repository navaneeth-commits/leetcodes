class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int i=0;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        func(0,nums,res,temp);
        return res;
    }
    public static void func(int i,int[] nums,List<List<Integer>> res,List<Integer> temp){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        func(i+1,nums,res,temp);
        temp.remove(temp.size()-1);
        func(i+1,nums,res,temp);
    }
}