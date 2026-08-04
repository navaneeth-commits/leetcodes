class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            new Solution();
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> nextGreater = new HashMap<>();

        for (int num : nums2) {

            while (!st.isEmpty() && st.peek() < num) {
                nextGreater.put(st.pop(), num);
            }

            st.push(num);
        }

        while (!st.isEmpty()) {
            nextGreater.put(st.pop(), -1);
        }
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.get(nums1[i]);
        }
        return ans;
    }
}