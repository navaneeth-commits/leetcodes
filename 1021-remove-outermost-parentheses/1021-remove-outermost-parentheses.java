class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                counter++;
                if (counter > 1) {
                    res.append(c);
                }
            } else {
                if (counter > 1) {
                    res.append(c);
                }
                counter--;
            }
        }

        return res.toString();
    }
}