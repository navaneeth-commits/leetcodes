class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int b=0;
        while(i<=j){
            int wt=people[i]+people[j];
            if(wt<=limit){
                b++;
                i++;
                j--;
            }else{
                j--;
                b++;
            }
        }
        return b;
    }
}