public class Solution {
    public int FindAllAnagramsInAString(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindAllAnagramsInAString(root.left), FindAllAnagramsInAString(root.right));
    }
}