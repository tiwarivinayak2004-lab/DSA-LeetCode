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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        if(root==null) return ans;
        que.offer(root);
        while(!que.isEmpty()){
            double size=que.size();
            double sum=0;
            for(int i=1;i<=size;i++){
                TreeNode curr=que.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
                }
            }
            double avg=sum/size;
            ans.add(avg);
        }
        return ans;
    }
}