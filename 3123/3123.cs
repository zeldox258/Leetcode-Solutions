public class Solution {
    public int FindEdgesInShortestPaths(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindEdgesInShortestPaths(root.left), FindEdgesInShortestPaths(root.right));
    }
}