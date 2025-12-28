public class Solution {
    public int RestoreTheArrayFromAdjacentPai(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RestoreTheArrayFromAdjacentPai(root.left), RestoreTheArrayFromAdjacentPai(root.right));
    }
}