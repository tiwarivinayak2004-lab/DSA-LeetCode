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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;

        TreeNode ans=searchNode(root,val);
        return ans;
    }
    public TreeNode searchNode(TreeNode node,int val)
    {
        if(node==null) return null;

        if(node.val>val) 
        return searchNode(node.left,val);

        if(node.val<val)
        return searchNode(node.right,val);

        return node;
    }
}