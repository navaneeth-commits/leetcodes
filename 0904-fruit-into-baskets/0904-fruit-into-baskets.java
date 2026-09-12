class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=fruits.length;
        int i=0;
        if(n<=2)return n;
        while(map.size()<2 && i<n){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            i++;
        }
        int m=0;
        int max=i;
        for(int j=i;j<fruits.length;j++){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2){
                map.put(fruits[m],map.getOrDefault(fruits[m],0)-1);
                if(map.get(fruits[m])==0)map.remove(fruits[m]);
                m++;
            }
            max=Math.max(max,j-m+1);
        }
        return max;
    }
}