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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean result = true;

        if(p == null && q == null){
            result = true;
        }else if(p != null && q != null && p.val == q.val){
            result = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else{
            result = false;
        }
        

        return result;
    }
}