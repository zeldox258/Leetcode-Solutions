public class Solution {
    public int HouseRobberIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(HouseRobberIi(root.left), HouseRobberIi(root.right));
    }
}