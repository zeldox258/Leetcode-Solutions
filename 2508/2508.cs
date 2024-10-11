public class Solution {
    public int AddEdgesToMakeDegreesOfAllNode(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(AddEdgesToMakeDegreesOfAllNode(root.left), AddEdgesToMakeDegreesOfAllNode(root.right));
    }
}