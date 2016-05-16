/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        
        int depth;
        if(root == null){
            depth = 0;
        }
        else{
            depth = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    return depth;
    }
}