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
    public int countNodes(TreeNode root) {
        int c = 1;

        if (root == null) {
            return 0;
        }

        if (root.left != null) {
            c = c + countNodes(root.left);
        }

        if (root.right != null) {
            c = c + countNodes(root.right);
        }

        return c;
    }
}
