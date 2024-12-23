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
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    arr[i]=node.val;
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            int[] sortedArr = arr.clone();
            Arrays.sort(sortedArr);
            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0; i<n; i++){
                map.put(arr[i], i);
            }
            for (int i=0; i<n; i++){
                if (arr[i]!=sortedArr[i]){
                    int index = map.get(sortedArr[i]);
                    map.put(arr[i], index);
                    arr[index] = arr[i]; 
                    count++;
                }
            }
        }
        return count;
    }
}