function detectSquares(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(detectSquares(root.left), detectSquares(root.right));
}