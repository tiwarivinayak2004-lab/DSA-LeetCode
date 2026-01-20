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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        if(root==null) return ans;

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        boolean flag=true;
        while(!que.isEmpty())
        {
            int size=que.size();
            List<Integer> subList=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=que.poll();
                if(flag)
                {
                    subList.addLast(node.val);
                }
                else{
                    subList.addFirst(node.val);
                }
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            flag=!flag;
            ans.add(subList);
        }
        return ans;
    }
}