function bagOfTokens(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(bagOfTokens(root.left), bagOfTokens(root.right));
}