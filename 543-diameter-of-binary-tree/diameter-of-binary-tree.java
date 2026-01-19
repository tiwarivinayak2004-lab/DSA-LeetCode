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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diam=new int[1];
        diameter(root,diam);
        return diam[0];
    }

    private int diameter(TreeNode root,int[] diam)
    {
        if(root==null) return 0;

        int lh=diameter(root.left,diam);
        int rh=diameter(root.right,diam);
        
        diam[0]=Math.max(diam[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
}