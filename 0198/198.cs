public class Solution {
    public int HouseRobber(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(HouseRobber(root.left), HouseRobber(root.right));
    }
}