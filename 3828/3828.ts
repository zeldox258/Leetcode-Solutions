function finalElementAfterSubarrayDelet(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(finalElementAfterSubarrayDelet(root.left), finalElementAfterSubarrayDelet(root.right));
}