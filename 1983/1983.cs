public class Solution {
    public int WidestPairOfIndicesWithEqualRa(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(WidestPairOfIndicesWithEqualRa(root.left), WidestPairOfIndicesWithEqualRa(root.right));
    }
}