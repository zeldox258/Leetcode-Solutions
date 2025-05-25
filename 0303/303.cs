public class Solution {
    public int RangeSumQueryImmutable(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(RangeSumQueryImmutable(root.left), RangeSumQueryImmutable(root.right));
    }
}