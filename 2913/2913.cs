public class Solution {
    public int SubarraysDistinctElementSumOfS(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SubarraysDistinctElementSumOfS(root.left), SubarraysDistinctElementSumOfS(root.right));
    }
}