public class Solution {
    public int FairCandySwap(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FairCandySwap(root.left), FairCandySwap(root.right));
    }
}