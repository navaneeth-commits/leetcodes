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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        list.add(Arrays.asList(root.val));
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    temp.add(node.left.val);
                    q.add(node.left);
                }
                if(node.right!=null){
                    temp.add(node.right.val);
                    q.add(node.right);
                }

            }
            if(!temp.isEmpty())list.add(temp);
        }
        return list;
    }
}