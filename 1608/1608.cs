public class Solution {
    public int SpecialArrayWithXElementsGreat(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SpecialArrayWithXElementsGreat(root.left), SpecialArrayWithXElementsGreat(root.right));
    }
}