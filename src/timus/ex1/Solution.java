package timus.ex1;
// link
// https://leetcode.com/problems/sqrtx/description/
class Solution {
    public int mySqrt(int x) {
        //binary search
        int left = 0;
        int right = x;
        int mid = 0;
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;

        while(left <= right) {
            mid = left + (right - left)/2;
            if(mid == x/mid)
                return mid;
            else if(mid < x/mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return right;
    }
}