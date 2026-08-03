
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> setS = new HashSet<>();
        HashSet<Character> setT = new HashSet<>();
        HashSet<String> pairs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            setS.add(s.charAt(i));
            setT.add(t.charAt(i));
            pairs.add(s.charAt(i) + "#" + t.charAt(i));
        }

        return setS.size() == setT.size() && setT.size() == pairs.size();
    }
}