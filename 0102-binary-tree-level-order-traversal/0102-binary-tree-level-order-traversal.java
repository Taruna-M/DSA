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
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        Queue<TreeNode> even = new LinkedList<>();
        Queue<TreeNode> odd = new LinkedList<>();
        if (root!=null) even.add(root);
        while (!even.isEmpty() || !odd.isEmpty()){
            level = new ArrayList<>();
            if (odd.isEmpty()){
                while (!even.isEmpty()){
                    root = even.remove();
                    if (root!=null){
                        level.add(root.val);
                        odd.add(root.left);
                        odd.add(root.right);
                    }
                }
            }
            else if (even.isEmpty()){
                while (!odd.isEmpty()){
                    root = odd.remove();
                    if (root!=null){
                        level.add(root.val);
                        even.add(root.left);
                        even.add(root.right);
                    }
                }
            }
            ans.add(level);
        }
        if (ans.size()>0) ans.remove(ans.size()-1);
        return ans;
    }
}