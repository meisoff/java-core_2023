package timus.ex18;
//https://leetcode.com/problems/binary-tree-inorder-traversal

import java.util.LinkedList;
import java.util.List;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class Solution {

    static void inorder( List<Integer> ans , TreeNode root )
    {
        if( root==null ) return ;

        inorder( ans ,root.left );
        ans.add( root.val );
        inorder( ans , root.right );

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();

        inorder( ans , root );
        return ans;

    }
}
