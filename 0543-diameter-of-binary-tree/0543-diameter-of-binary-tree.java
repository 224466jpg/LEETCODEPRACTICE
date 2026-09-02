/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxdiameter;
    public int height(TreeNode root){
        if(root == null) return 0;
        int lfthyt = height(root.left);
        int rythyt = height(root.right);
        maxdiameter = Math.max(maxdiameter,lfthyt+rythyt);
        return 1 + Math.max(lfthyt , rythyt);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxdiameter = 0;
        height(root);
        return maxdiameter;
    }
}