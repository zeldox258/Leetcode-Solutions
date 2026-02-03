public class Solution {
    public int ManagerOfTheLargestDepartment(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(ManagerOfTheLargestDepartment(root.left), ManagerOfTheLargestDepartment(root.right));
    }
}