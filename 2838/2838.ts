function maximumCoinsHeroesCanCollect(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumCoinsHeroesCanCollect(root.left), maximumCoinsHeroesCanCollect(root.right));
}