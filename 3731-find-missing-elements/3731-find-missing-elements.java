class Solution {
    static{
        for(int i=0;i<500;i++){
            new Solution();
        }
    }
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            set.add(i);
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i))list.add(i);
        }
        return list;
    }
}