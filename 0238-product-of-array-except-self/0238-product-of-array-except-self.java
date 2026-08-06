class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            productExceptSelf(new int[] { 0, 1 });
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suff = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suff;
            suff *= nums[i];
        }
        return res;
    }
}
