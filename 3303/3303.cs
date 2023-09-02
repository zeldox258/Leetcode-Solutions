public class Solution {
    public int FindTheOccurrenceOfFirstAlmost(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FindTheOccurrenceOfFirstAlmost(root.left), FindTheOccurrenceOfFirstAlmost(root.right));
    }
}