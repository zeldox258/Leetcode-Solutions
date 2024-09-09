public class Solution {
    public int SearchInRotatedSortedArray(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SearchInRotatedSortedArray(root.left), SearchInRotatedSortedArray(root.right));
    }
}