class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder t=new StringBuilder(s);
        t.append(s);
        return t.toString().contains(goal)&&(s.length()==goal.length());
    }
}