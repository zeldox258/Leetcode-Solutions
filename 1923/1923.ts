function longestCommonSubpath(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestCommonSubpath(root.left), longestCommonSubpath(root.right));
}