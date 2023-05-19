public class Solution {
    public int FindCitiesInEachState(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindCitiesInEachState(root.left), FindCitiesInEachState(root.right));
    }
}