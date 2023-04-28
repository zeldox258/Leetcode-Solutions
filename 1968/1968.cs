public class Solution {
    public int ArrayWithElementsNotEqualToAve(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ArrayWithElementsNotEqualToAve(root.left), ArrayWithElementsNotEqualToAve(root.right));
    }
}