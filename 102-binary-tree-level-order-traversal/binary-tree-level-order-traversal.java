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
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        List<List<Integer>> wrapList=new LinkedList<List<Integer>>();
        if(root==null) return wrapList;
        que.add(root);
        while(!que.isEmpty())
        {
            int levelNum=que.size();
            List<Integer> subList=new LinkedList<>();
            for(int i=0;i<levelNum;i++)
            {
                if(que.peek().left!=null) que.add(que.peek().left);
                if(que.peek().right!=null) que.add(que.peek().right);
                subList.add(que.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}