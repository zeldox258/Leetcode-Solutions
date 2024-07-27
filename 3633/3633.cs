public class Solution {
    public int EarliestFinishTimeForLandAndWa(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(EarliestFinishTimeForLandAndWa(root.left), EarliestFinishTimeForLandAndWa(root.right));
    }
}