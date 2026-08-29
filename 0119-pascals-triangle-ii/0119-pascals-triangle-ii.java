class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();

        long value = 1; // C(n, 0)

        for (int r = 0; r <= n; r++) {
            row.add((int) value);

            value = value * (n - r) / (r + 1);
        }
        return row;
    }
}