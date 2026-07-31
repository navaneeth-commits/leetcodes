class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if (n <= 8)
            return n;
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int cost=0;
        int ind = 1;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            int pushes;
            if (ind <= 8) {
                pushes = 1;
            } else if (ind <= 16) {
                pushes = 2;
            } else if (ind <= 24) {
                pushes = 3;
            } else {
                pushes = 4;
            }
            cost += freq[i] * pushes;
            ind++;
        }
        return cost;
    }
}