public class Solution {
    public int CheckIfAllTheIntegersInARangeA(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CheckIfAllTheIntegersInARangeA(root.left), CheckIfAllTheIntegersInARangeA(root.right));
    }
}