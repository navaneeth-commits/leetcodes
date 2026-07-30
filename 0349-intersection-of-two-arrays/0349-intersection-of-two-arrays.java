class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        for(int i:nums2){
            b.add(i);
        }
        int i=0;
        int j=0;
        ArrayList<Integer> arr=new ArrayList<>();
       for(int x:a){
        if(b.contains(x)) arr.add(x);
       }
       int[] ans = new int[arr.size()];
       for(int k= 0;k<arr.size();k++){
           ans[k]=arr.get(k);
       }
       return ans;
    }
}