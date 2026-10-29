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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        dfs(root,targetSum,ans,path);
        return ans;
    }
    private void dfs(TreeNode root,int tSum,List<List<Integer>> ans,List<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.val);
        tSum-=root.val;

        if(root.left==null && root.right==null && tSum==0){
            ans.add(new ArrayList(path));
        }
        else{
            dfs(root.left,tSum,ans,path);
            dfs(root.right,tSum,ans,path);
        }
        path.remove(path.size()-1);
    }
}