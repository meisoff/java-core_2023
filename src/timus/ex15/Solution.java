package timus.ex15;
// https://leetcode.com/problems/climbing-stairs/
class Solution {
    public int climbStairs(int n) {
        int s1=1;
        int s2=1;
        if(n==1){
            return s2;
        }
        int k;
        for(int i=2;i<=n;i++){
            k=s1+s2;
            s1=s2;
            s2=k;
        }
        return s2;
    }
}
