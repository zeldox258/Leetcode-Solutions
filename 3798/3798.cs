public class Solution {
    public int LargestEvenNumber(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(LargestEvenNumber(root.left), LargestEvenNumber(root.right));
    }
}