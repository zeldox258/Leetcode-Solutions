public class Solution {
    public int TheMostSimilarPathInAGraph(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(TheMostSimilarPathInAGraph(root.left), TheMostSimilarPathInAGraph(root.right));
    }
}