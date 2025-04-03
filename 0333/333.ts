function largestBstSubtree(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(largestBstSubtree(root.left), largestBstSubtree(root.right));
}