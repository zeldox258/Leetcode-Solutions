public class Solution {
    public int CustomersWhoBoughtProductsAAnd(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CustomersWhoBoughtProductsAAnd(root.left), CustomersWhoBoughtProductsAAnd(root.right));
    }
}