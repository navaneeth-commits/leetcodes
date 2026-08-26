class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                list.add(i);
            }
        }
        int minlen=101;
        String ans="";
        for(int i=0;i+k-1<list.size();i++){
            int left=list.get(i);
            int right=list.get(i+k-1);
            int len=right-left+1;
            String curr=s.substring(left,right+1);
            if(len<minlen || (len==minlen && curr.compareTo(ans)<0)){
                minlen=len;
                ans=curr;
            }
        }
        return ans;
    }
}