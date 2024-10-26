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
import java.util.*;

class Solution {
    //height array
    private int[] height = new int[100001];

    // Function to calculate the height of each subtree
    private int calHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = calHeight(root.left);
        int rightHeight = calHeight(root.right);
        height[root.val] = Math.max(leftHeight, rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int[] treeQueries(TreeNode root, int[] queries) {
        // array for storing height of tree if that index node is deleted
        int[] newHeight = new int[100001];
        calHeight(root); // Calculate initial heights

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            // if only one node
            if (n == 1) {
                TreeNode curr = q.poll();
                newHeight[curr.val] = level - 1;
                level++;
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
                continue;
            }

            int maxIdx = 0, secondMaxIdx = 0;
            // Find maximum and second maximum heights
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (height[curr.val] > height[maxIdx]) {
                    secondMaxIdx = maxIdx;
                    maxIdx = curr.val;
                } else if (height[curr.val] > height[secondMaxIdx]) {
                    secondMaxIdx = curr.val;
                }
                q.offer(curr);
            }

            // Update newHeight for each node in the current level
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (curr.val == maxIdx) {
                    newHeight[curr.val] = level + height[secondMaxIdx];
                } else {
                    newHeight[curr.val] = level + height[maxIdx];
                }
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            level++;
        }

        // Process the queries
        for (int i = 0; i < queries.length; i++) {
            queries[i] = newHeight[queries[i]];
        }

        return queries;
    }
}