class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for(right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.getOrDefault(s.charAt(right),0)>2){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}