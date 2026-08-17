class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        int i = 0;
        List<String> res = new ArrayList<>();

        while (i < n) {
            int start = nums[i];
            while (i+1 < n && nums[i]+1 == nums[i+1]) {
                i++;
            }
            if (start != nums[i]) {
                res.add("%d->%d".formatted(start, nums[i]));
            } else {
                res.add("%d".formatted(nums[i]));
            }
            i++;
        }
        
        return res;
    }
}