public class Solution {
    public int FindNumberOfCoinsToPlaceInTree(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindNumberOfCoinsToPlaceInTree(root.left), FindNumberOfCoinsToPlaceInTree(root.right));
    }
}