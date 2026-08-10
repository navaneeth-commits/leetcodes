class Solution {
    public int uniquePaths(int m, int n) {

        int numer = m + n - 2;
        int denom = Math.max(m - 1, n - 1);
        int other = Math.min(m - 1, n - 1);

        long ans = 1;

        for (int i = 1; i <= other; i++) {
            ans = ans * (denom + i) / i;
        }

        return (int) ans;
    }
}