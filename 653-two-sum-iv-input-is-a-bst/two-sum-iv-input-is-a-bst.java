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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        BSTIterator l=new BSTIterator(root,false);
        BSTIterator r=new BSTIterator(root,true);

        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k) return true;
            else if(i+j<k) i=l.next();
            else j=r.next();
        }
        return false;
    }
}
public class BSTIterator{
    private Stack<TreeNode> st=new Stack<>();
    boolean reverse=true;
    public BSTIterator(TreeNode root,boolean isReverse)
    {
        reverse=isReverse;
        pushall(root);
    }
    public boolean hasNext(){
        return !st.isEmpty();
    }
    public int next(){
        TreeNode tmpNode=st.pop();
        if(reverse==false) pushall(tmpNode.right);
        else pushall(tmpNode.left);
        return tmpNode.val;
    }
    public void pushall(TreeNode root)
    {
        while(root!=null)
        {
            st.push(root);
            if(reverse==true) root=root.right;
            else root=root.left;
        }
    }
    
}