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
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode,TreeNode> parentMap= new HashMap<>();
        TreeNode startNode=buildParentMap(root,null,parentMap,start);

        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();

        q.offer(startNode);
        visited.add(startNode);
        int time=-1;
        while(!q.isEmpty())
        {
            int size=q.size();
            time++;

            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null && !visited.contains(curr.left))
                {
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                if (curr.right != null && !visited.contains(curr.right)) {
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                
                // parent
                TreeNode parent = parentMap.get(curr);
                if (parent != null && !visited.contains(parent)) {
                    q.offer(parent);
                    visited.add(parent);
                }
            }
        }
        
        return time;
    }
    
    
    private TreeNode buildParentMap(TreeNode node, TreeNode parent,
                                    Map<TreeNode, TreeNode> parentMap,
                                    int start) {
        
        if (node == null)
            return null;
        
        parentMap.put(node, parent);
        
        TreeNode left = buildParentMap(node.left, node, parentMap, start);
        TreeNode right = buildParentMap(node.right, node, parentMap, start);
        
        if (node.val == start)
            return node;
        
        return left != null ? left : right;
    }
 }
        

    