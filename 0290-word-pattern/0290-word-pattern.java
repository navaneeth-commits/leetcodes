class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mapST = new HashMap<>();
        HashMap<String,Character> mapTS = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length())return false;
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            String b=words[i];
            // Check s -> t
            if (mapST.containsKey(a)) {
                if (!mapST.get(a).equals(b))
                    return false;
            } else {
                mapST.put(a, b);
            }

            // Check t -> s
            if (mapTS.containsKey(b)) {
                if (mapTS.get(b) != a)
                    return false;
            } else {
                mapTS.put(b, a);
            }
        }

        return true;
    }
}