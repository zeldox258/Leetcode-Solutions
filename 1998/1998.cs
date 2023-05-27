public class Solution {
    public int GcdSortOfAnArray(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(GcdSortOfAnArray(root.left), GcdSortOfAnArray(root.right));
    }
}