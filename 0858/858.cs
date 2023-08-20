public class Solution {
    public int MirrorReflection(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MirrorReflection(root.left), MirrorReflection(root.right));
    }
}