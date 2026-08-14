class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int i=0;
        int res=0;
        for(int j=0;j<s.length();j++){
            char c =s.charAt(j);
            freq[c-'a']++;
            while(freq[c-'a']>2){
                freq[s.charAt(i)-'a']--;
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;

    }
}