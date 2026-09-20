class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closex=Math.max(x1,Math.min(x2,xCenter));
        int closey=Math.max(y1,Math.min(y2,yCenter));
        int dx=xCenter-closex;
        int dy=yCenter-closey;
        return dx*dx + dy*dy <=radius*radius;
    }
}