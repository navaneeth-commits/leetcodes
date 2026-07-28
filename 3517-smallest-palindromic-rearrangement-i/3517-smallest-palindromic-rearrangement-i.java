class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        // n=n/2;
        // String res="";
        // char min=s.charAt(0);
        // for(int i=0;i<=n;i++){
        //     min=math.min(min,s.charAt(i));
        // }
        if(s.length()==1) return s;
        char[] arr=new char[n/2];
        for(int i=0;i<n/2;i++){
            arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        StringBuilder res=new StringBuilder();
        for(char c:arr){
            res.append(c);
        }
        if(n%2!=0) res.append(s.charAt(n/2));
        for(int i=n/2-1;i>=0;i--){
            res.append(arr[i]);
        }
        return res.toString();
    }
}