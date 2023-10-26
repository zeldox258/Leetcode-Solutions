function constructBinarySearchTreeFromP(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(constructBinarySearchTreeFromP(root.left), constructBinarySearchTreeFromP(root.right));
}