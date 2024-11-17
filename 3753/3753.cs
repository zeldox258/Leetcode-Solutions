public class Solution {
    public int TotalWavinessOfNumbersInRangeI(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(TotalWavinessOfNumbersInRangeI(root.left), TotalWavinessOfNumbersInRangeI(root.right));
    }
}