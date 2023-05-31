package timus.ex13;
// https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digit) {
        for(int i=digit.length-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                return digit;
            }else{
                digit[i]=0;
            }
        }
        int res[]=new int[digit.length+1];
        res[0]=1;
        return res;
    }
}
