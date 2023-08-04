public class Solution {
    public int GuessTheWord(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(GuessTheWord(root.left), GuessTheWord(root.right));
    }
}