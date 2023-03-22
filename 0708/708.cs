public class Solution {
    public int InsertIntoASortedCircularLinke(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(InsertIntoASortedCircularLinke(root.left), InsertIntoASortedCircularLinke(root.right));
    }
}