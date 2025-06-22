public class Solution {
    public int SumOfImbalanceNumbersOfAllSuba(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(SumOfImbalanceNumbersOfAllSuba(root.left), SumOfImbalanceNumbersOfAllSuba(root.right));
    }
}