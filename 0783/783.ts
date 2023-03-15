function minimumDistanceBetweenBstNodes(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumDistanceBetweenBstNodes(root.left), minimumDistanceBetweenBstNodes(root.right));
}