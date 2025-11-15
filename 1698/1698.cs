public class Solution {
    public int NumberOfDistinctSubstringsInAS(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfDistinctSubstringsInAS(root.left), NumberOfDistinctSubstringsInAS(root.right));
    }
}