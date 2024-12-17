public class Solution {
    public int MirrorDistanceOfAnInteger(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MirrorDistanceOfAnInteger(root.left), MirrorDistanceOfAnInteger(root.right));
    }
}