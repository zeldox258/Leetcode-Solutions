function stoneGameV(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(stoneGameV(root.left), stoneGameV(root.right));
}