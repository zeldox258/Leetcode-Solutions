function longestNondecreasingSubarrayAf(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestNondecreasingSubarrayAf(root.left), longestNondecreasingSubarrayAf(root.right));
}