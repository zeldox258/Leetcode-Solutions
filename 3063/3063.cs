public class Solution {
    public int LinkedListFrequency(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LinkedListFrequency(root.left), LinkedListFrequency(root.right));
    }
}