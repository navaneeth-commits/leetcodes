class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        char carry='0';
        StringBuilder res=new StringBuilder();
        while(i>=0 || j>=0 || carry!='0'){
            char x=((i>=0)?a.charAt(i):'0');
            char y=((j>=0)?b.charAt(j):'0');
            if(carry=='0'){
                if(x=='1' && y=='1'){
                    carry='1';
                    res.append('0');
                }else if(x=='1'||y=='1'){
                    carry='0';
                    res.append('1');
                }else{
                    carry='0';
                    res.append('0');
                }
            }else{
                if(x=='1' && y=='1'){
                    carry='1';
                    res.append('1');
                }else if(x=='1'||y=='1'){
                    carry='1';
                    res.append('0');
                }else{
                    carry='0';
                    res.append('1');
                }
            }
            i--;
            j--;
        }
        //res.append(carry);
        res=res.reverse();
        //if(res.charAt(0)=='0')res.deleteCharAt(0);
        return res.toString();
    }
}