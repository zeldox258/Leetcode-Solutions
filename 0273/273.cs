public class Solution {
    public int IntegerToEnglishWords(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(IntegerToEnglishWords(root.left), IntegerToEnglishWords(root.right));
    }
}