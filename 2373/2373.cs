public class Solution {
    public int LargestLocalValuesInAMatrix(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LargestLocalValuesInAMatrix(root.left), LargestLocalValuesInAMatrix(root.right));
    }
}