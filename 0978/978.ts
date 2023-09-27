function longestTurbulentSubarray(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestTurbulentSubarray(root.left), longestTurbulentSubarray(root.right));
}