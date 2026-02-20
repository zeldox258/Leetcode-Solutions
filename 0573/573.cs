public class Solution {
    public int SquirrelSimulation(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SquirrelSimulation(root.left), SquirrelSimulation(root.right));
    }
}