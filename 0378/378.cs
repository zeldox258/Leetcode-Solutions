public class Solution {
    public int KthSmallestElementInASortedMat(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(KthSmallestElementInASortedMat(root.left), KthSmallestElementInASortedMat(root.right));
    }
}