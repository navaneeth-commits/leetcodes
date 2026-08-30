class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, maxind = 0;
        int min = Integer.MAX_VALUE, minind = 0;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxind = i;
            }
            if (min > nums[i]) {
                min = nums[i];
                minind = i;
            }
        }
        int left = Math.min(minind, maxind);
        int right = Math.max(minind, maxind);
        int fromFront = right + 1;
        int fromBack = n - left;
        int mixed = (left + 1) + (n - right);
        return Math.min(fromFront, Math.min(fromBack, mixed));
    }
}