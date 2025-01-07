public class Solution {
    public int FindMinimumInRotatedSortedArra(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindMinimumInRotatedSortedArra(root.left), FindMinimumInRotatedSortedArra(root.right));
    }
}