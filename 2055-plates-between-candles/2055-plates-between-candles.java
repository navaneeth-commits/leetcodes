class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            new Solution();
        }
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] pre = new int[n + 1];
        // keeping count of number of plates before the index
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + (s.charAt(i) == '*' ? 1 : 0);
        }
        //keeping nearest candle (before i) or itself if i is a candle
        int[] left = new int[n];
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '|')
                last = i;
            left[i] = last;
        }

        //keeping nearest candle (after i) or itself if i is a candle
        int[] right = new int[n];
        last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|')
                last = i;
            right[i] = last;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = right[queries[i][0]];
            int r = left[queries[i][1]];
            if (l == -1 || r == -1 || l >= r) {
                ans[i] = 0;
            } else {
                ans[i] = pre[r] - pre[l];
            }
        }
        return ans;
    }
}