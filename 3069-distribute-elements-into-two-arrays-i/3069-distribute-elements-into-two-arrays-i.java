class Solution {
    public int[] resultArray(int[] nums) {
        int[] res=new int[nums.length];
        int[] arr=new int[nums.length];
        res[0]=nums[0];
        arr[0]=nums[1];
        int r=0;
        int a=0;
        for(int i=2;i<nums.length;i++){
            if(res[r]>arr[a]){
                res[++r]=nums[i];
            }else{
                arr[++a]=nums[i];
            }
        }
        for(int i=0;i<=a;i++){
            res[++r]=arr[i];
        }
        return res;
    }
}