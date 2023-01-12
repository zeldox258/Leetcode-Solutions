public class Solution {
    public int SumOfAllSubsetXorTotals(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfAllSubsetXorTotals(root.left), SumOfAllSubsetXorTotals(root.right));
    }
}