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
    int postIndex=0;
    private Map<Integer,Integer> inMap = new HashMap<Integer , Integer>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        postIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++)
        {
            inMap.put(inorder[i],i);
        }

        return buildTree(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] inorder,int[] postorder,int inStart,int inEnd)
    {
        if(inStart>inEnd) return null;

        TreeNode root= new TreeNode(postorder[postIndex--]);
        int inRoot=inMap.get(root.val);

        root.right=buildTree(inorder,postorder,inRoot+1,inEnd);

        root.left=buildTree(inorder,postorder,inStart,inRoot-1);

        return root;

    }
}