function divideNodesIntoTheMaximumNumbe(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(divideNodesIntoTheMaximumNumbe(root.left), divideNodesIntoTheMaximumNumbe(root.right));
}