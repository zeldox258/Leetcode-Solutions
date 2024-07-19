public class Solution {
    public int SortItemsByGroupsRespectingDep(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SortItemsByGroupsRespectingDep(root.left), SortItemsByGroupsRespectingDep(root.right));
    }
}