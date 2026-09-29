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
    int counter=0;
    int answer=0;
    public int kthSmallest(TreeNode root, int k) {
        counter=k;
        count(root);
        return answer;
    }
    private void count(TreeNode root){
        if(root==null) return;
        count(root.left);
        counter--;
        if(counter==0){
            answer=root.val;
            return;
        }
        count(root.right);
    }
}