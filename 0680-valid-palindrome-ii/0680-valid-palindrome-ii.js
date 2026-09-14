/**
 * @param {string} s
 * @return {boolean}
 */
var validPalindrome = function(s) {
    let i=0,j=s.length-1;
    while(i<j){
        if(s[i]!=s[j])return ispal(s,i+1,j)||ispal(s,i,j-1);
        i++;
        j--;
    }
    return true;
};

var ispal=function(s,i,j){
    while(i<j){
        if(s[i]!=s[j])return false;
        i++;
        j--;
    }
    return true;
};