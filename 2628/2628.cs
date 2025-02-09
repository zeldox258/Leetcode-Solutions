public class Solution {
    public int JsonDeepEqual(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(JsonDeepEqual(root.left), JsonDeepEqual(root.right));
    }
}