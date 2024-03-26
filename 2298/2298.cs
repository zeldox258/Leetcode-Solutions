public class Solution {
    public int TasksCountInTheWeekend(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(TasksCountInTheWeekend(root.left), TasksCountInTheWeekend(root.right));
    }
}