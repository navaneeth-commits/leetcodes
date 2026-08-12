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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        return dfs(list,root);
    }
    public List<Integer> dfs(List<Integer> list,TreeNode root){
        if(root==null)return list;
        if(root.left!=null)dfs(list,root.left);
        if(root.right!=null)dfs(list,root.right);
        list.add(root.val);
        return list;
    }
}