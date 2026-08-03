class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> charIndexS=new HashMap<>();
        HashMap<Character,Integer> charIndexT=new HashMap<>();

        for(int i=0; i<s.length();i++){
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            if(!charIndexS.containsKey(ss)){
                charIndexS.put(ss,i);
            }
            if(!charIndexT.containsKey(tt)){
                charIndexT.put(tt,i);
            }

            if(!charIndexS.get(ss).equals(charIndexT.get(tt))){
                return false;
            }
        }
        return true;
        
    }
}