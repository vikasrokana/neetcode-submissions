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
    public boolean isSameTree(TreeNode p, TreeNode q) {
 // 1. check both node 
        if(p==null && q == null){
            return true;
        }
// 2. check one node at time
        if(p ==null || q == null){
            return false;
        }
// 3. check the value of node
        if(p.val != q.val){
            return false;
        }

// 4. check left and right subtree
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);      
        
    }
}
