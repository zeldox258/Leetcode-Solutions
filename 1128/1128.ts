function numberOfEquivalentDominoPairs(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfEquivalentDominoPairs(root.left), numberOfEquivalentDominoPairs(root.right));
}