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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> arr = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    arr.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            List<Integer> sortedArr = new ArrayList<>(arr);
            Collections.sort(sortedArr);
            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0; i<n; i++){
                map.put(arr.get(i), i);
            }
            for (int i=0; i<n; i++){
                if (arr.get(i)!=sortedArr.get(i)){
                    int index = map.get(sortedArr.get(i));
                    map.put(arr.get(i), index);
                    arr.set(index, arr.get(i));
                    count++;
                }
            }
        }
        return count;
    }
}