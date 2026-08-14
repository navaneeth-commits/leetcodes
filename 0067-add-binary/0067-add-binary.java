class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        char carry='0';
        String res="";
        while(i>=0 || j>=0 || carry!='0'){
            char x=((i>=0)?a.charAt(i):'0');
            char y=((j>=0)?b.charAt(j):'0');
            if(carry=='0'){
                if(x=='1' && y=='1'){
                    carry='1';
                    res+='0';
                }else if(x=='1'||y=='1'){
                    carry='0';
                    res+='1';
                }else{
                    carry='0';
                    res+='0';
                }
            }else{
                if(x=='1' && y=='1'){
                    carry='1';
                    res+='1';
                }else if(x=='1'||y=='1'){
                    carry='1';
                    res+='0';
                }else{
                    carry='0';
                    res+='1';
                }
            }
            i--;
            j--;
        }
        res+=carry;
        StringBuilder result=new StringBuilder(res);
        result=result.reverse();
        if(result.charAt(0)=='0')result.deleteCharAt(0);
        return result.toString();
    }
}