class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int res=0;
        int count=1;
        for(int i=1;i<tasks.length;i++){
            if(tasks[i]==tasks[i-1]){
                count++;
            }else{
                if(count==1)return -1;
                res+=(count+2)/3;
                count=1;
            }
        }
        if(count==1)return -1;
        res+=(count+2)/3;
        return res;
    }
}