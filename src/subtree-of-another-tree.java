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
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if(root == null) return false;
    if(subRoot == null) return true;

    if(isIdentical(root, subRoot)) return true;

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

  }

  public boolean isIdentical(TreeNode l , TreeNode r){
    if(l == null && r == null ) return true;
    if(l == null || r == null ) return false;

    return l.val == r.val && isIdentical(l.left, r.left) && isIdentical(l.right, r.right);
  }
}