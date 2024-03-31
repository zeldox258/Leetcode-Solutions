public class Solution {
    public int NumberOfUniqueXorTripletsI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(NumberOfUniqueXorTripletsI(root.left), NumberOfUniqueXorTripletsI(root.right));
    }
}