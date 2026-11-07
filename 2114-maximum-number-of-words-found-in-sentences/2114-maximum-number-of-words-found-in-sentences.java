class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(int i=0;i<s.length;i++){
            int count=1;
            for(char c:s[i].toCharArray()){
                if(c==' ')count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}