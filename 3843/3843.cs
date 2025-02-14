public class Solution {
    public int FirstElementWithUniqueFrequenc(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(FirstElementWithUniqueFrequenc(root.left), FirstElementWithUniqueFrequenc(root.right));
    }
}