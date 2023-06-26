public class Solution {
    public int FindMissingObservations(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindMissingObservations(root.left), FindMissingObservations(root.right));
    }
}