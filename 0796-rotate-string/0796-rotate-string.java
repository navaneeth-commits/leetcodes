class Solution {
    public boolean rotateString(String s, String goal) {
        String t=s+s;
        return t.contains(goal)&&(s.length()==goal.length());
    }
}