class Solution {
    public int lengthOfLongestSubstring(String s) {
        int dupl=0;
        int max=0;
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            while(set.contains(c)){
                set.remove(s.charAt(dupl));
                dupl++;
            }
            set.add(c);
            max=Math.max(max,set.size());
        }
        return max;
    }
}