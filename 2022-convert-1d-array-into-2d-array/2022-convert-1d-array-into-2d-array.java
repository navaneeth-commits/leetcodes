class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr=new int[m][n];
        int k=0;
        if(m*n<original.length || m*n>original.length)return new int[][]{};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[k];
                k++;
            }
        }
        return arr;
    }
}