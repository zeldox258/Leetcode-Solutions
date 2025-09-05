public class Solution {
    public int MaximumCoinsHeroesCanCollect(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.Max(MaximumCoinsHeroesCanCollect(root.left), MaximumCoinsHeroesCanCollect(root.right));
    }
}