function maximumSumCircularSubarray(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumSumCircularSubarray(root.left), maximumSumCircularSubarray(root.right));
}