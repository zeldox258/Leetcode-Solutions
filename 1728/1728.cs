public class Solution {
    public int CatAndMouseIi(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(CatAndMouseIi(root.left), CatAndMouseIi(root.right));
    }
}