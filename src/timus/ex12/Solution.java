package timus.ex12;
//https://leetcode.com/problems/length-of-last-word
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while(s.charAt(i) == ' ' && i-- > -1);
        while( i > -1 && s.charAt(i--) != ' ') length++;
        return length;
    }
}