function countNumberOfNiceSubarrays(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countNumberOfNiceSubarrays(root.left), countNumberOfNiceSubarrays(root.right));
}