public class Solution {
    public int SortThePeople(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SortThePeople(root.left), SortThePeople(root.right));
    }
}