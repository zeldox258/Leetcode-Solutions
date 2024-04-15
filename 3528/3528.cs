public class Solution {
    public int UnitConversionI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(UnitConversionI(root.left), UnitConversionI(root.right));
    }
}