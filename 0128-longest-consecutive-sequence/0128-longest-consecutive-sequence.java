class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
            for (int i = 0; i < n; i++) {
                set.add(nums[i]);
            }
            int max = 0;
            for (int num : set) {
                if (!set.contains(num - 1)) {
                    int cur = num;
                    int len = 1;
                    while (set.contains(cur + 1)) {
                        cur++;
                        len++;
                    }
                    max = Math.max(max, len);
                }
            }
            return max;
    }
}