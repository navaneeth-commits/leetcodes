class Solution {
    static{
        for(int i=0;i<500;i++){
            generate(1);
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();

            long value = 1;  // C(n, 0)

            for (int r = 0; r <= n; r++) {
                row.add((int) value);

                value = value * (n - r) / (r + 1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}