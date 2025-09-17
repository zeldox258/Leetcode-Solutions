public class Solution {
    public int CountSubstringsThatDifferByOne(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CountSubstringsThatDifferByOne(root.left), CountSubstringsThatDifferByOne(root.right));
    }
}