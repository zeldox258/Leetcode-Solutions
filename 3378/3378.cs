public class Solution {
    public int CountConnectedComponentsInLcmG(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountConnectedComponentsInLcmG(root.left), CountConnectedComponentsInLcmG(root.right));
    }
}