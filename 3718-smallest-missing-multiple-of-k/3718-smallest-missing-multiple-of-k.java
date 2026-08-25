class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int j=k;
        int i=2;
        while(true){
            if(set.contains(j)){
                j=k*i;
                i++;
            }else{
                return j;
            }
        }
        //return k;
    }
}