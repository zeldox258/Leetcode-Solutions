public class Solution {
    public int FindTheMaximumNumberOfFruitsCo(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheMaximumNumberOfFruitsCo(root.left), FindTheMaximumNumberOfFruitsCo(root.right));
    }
}