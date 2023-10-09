public class Solution {
    public int CheckIfEveryRowAndColumnContai(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CheckIfEveryRowAndColumnContai(root.left), CheckIfEveryRowAndColumnContai(root.right));
    }
}