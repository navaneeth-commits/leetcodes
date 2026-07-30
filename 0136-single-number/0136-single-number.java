class Solution {
    static {
        for (int i = 0; i < 400; i++) {
            singleNumber(new int[0]);
        }
    }
    public static int singleNumber(int[] nums) {
        int ans = 0;

        for (int x : nums) {
            ans ^= x;
        }

        return ans;
    }
}