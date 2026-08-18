class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            q.offer(num);
        }
        while(q.size()>1){
            int max1=q.poll();
            int max2=q.poll();
            q.offer(Math.abs(max1-max2));
        }
        return q.peek();
    }
}