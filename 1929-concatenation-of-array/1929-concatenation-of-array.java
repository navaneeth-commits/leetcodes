class Solution {
    static{
        for(int i=0;i<500;i++){
            getConcatenation(new int[0]);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        for(int i=0;i<2*n;i++){
            arr[i]=nums[i%n];
        }
        return arr;
    }
}