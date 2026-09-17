class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int freq:map.values()){
            if(freq==1)return -1;
            res+=(freq%3==0)?freq/3:freq/3 +1;
        }
        return res;
    }
}