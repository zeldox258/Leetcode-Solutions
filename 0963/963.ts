function minimumAreaRectangleIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumAreaRectangleIi(root.left), minimumAreaRectangleIi(root.right));
}