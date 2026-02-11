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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        if(root==null) return ans;
        dfs(root,new StringBuilder(),ans);
        return ans;
    }
    public void dfs(TreeNode node,StringBuilder path,ArrayList<String> res)
    {
        if(node==null) return;

        int len=path.length();
        path.append(node.val);

        if(node.left==null && node.right==null)
        {
            res.add(path.toString());
        }
        else
        {
            path.append("->");
            dfs(node.left,path,res);
            dfs(node.right,path,res);
        }
        path.setLength(len);
    }
}