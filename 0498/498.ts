function diagonalTraverse(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(diagonalTraverse(root.left), diagonalTraverse(root.right));
}