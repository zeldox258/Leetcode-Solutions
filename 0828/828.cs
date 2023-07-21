public class Solution {
    public int CountUniqueCharactersOfAllSubs(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountUniqueCharactersOfAllSubs(root.left), CountUniqueCharactersOfAllSubs(root.right));
    }
}