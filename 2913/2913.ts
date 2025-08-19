function subarraysDistinctElementSumOfS(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(subarraysDistinctElementSumOfS(root.left), subarraysDistinctElementSumOfS(root.right));
}