public class Solution {
    public int GetBiggestThreeRhombusSumsInAG(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(GetBiggestThreeRhombusSumsInAG(root.left), GetBiggestThreeRhombusSumsInAG(root.right));
    }
}