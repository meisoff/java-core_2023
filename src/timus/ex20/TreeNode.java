package timus.ex20;
// https://leetcode.com/problems/symmetric-tree/

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return breakTree(root,root);
    }
    public static boolean breakTree(TreeNode left,TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        return (left.val == right.val) && breakTree(left.left,right.right) && breakTree(left.right,right.left);

    }
}
