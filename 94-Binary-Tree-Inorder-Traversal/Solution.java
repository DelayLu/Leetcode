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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        if(root != null){
            if(root.left != null){
            left = inorderTraversal(root.left);
            }
            for(int i = 0; i < left.size(); i++){
                result.add(left.get(i));
            }
            result.add(root.val);
            if(root.right != null){
                right = inorderTraversal(root.right);
            }
            for(int i = 0; i < right.size(); i++){
                result.add(right.get(i));
            }
        }
        
        return result;
    }
}
