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
    public int minDepth(TreeNode root) {
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return 0;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
             for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                // If it's a leaf node, return current depth
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}