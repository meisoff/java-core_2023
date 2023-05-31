package timus.ex9;
//https://leetcode.com/problems/remove-element/

import java.util.HashMap;

class Solution {
    public int removeElement(int[] nums, int val) {

        HashMap<Integer, Integer> withoutValue = new HashMap<>();

        int j =0;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] != val)
            {
                withoutValue.put(i,nums[i]);
                nums[j++] = nums[i];
            }
        }

        return withoutValue.size();

    }
}
