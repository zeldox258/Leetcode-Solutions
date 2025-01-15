public class Solution {
    public int VowelconsonantScore(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(VowelconsonantScore(root.left), VowelconsonantScore(root.right));
    }
}