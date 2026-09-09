class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=(int)1e9;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(helper(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean helper(int[] piles,int h,int k){
        long total=0;
        for(int i=0;i<piles.length;i++){
            total+=(int)Math.ceil((double)piles[i]/k);
        }
        return total<=h;
    }
}