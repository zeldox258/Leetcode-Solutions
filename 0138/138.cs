public class Solution {
    public int CopyListWithRandomPointer(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CopyListWithRandomPointer(root.left), CopyListWithRandomPointer(root.right));
    }
}