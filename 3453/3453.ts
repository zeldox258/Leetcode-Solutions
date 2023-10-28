function separateSquaresI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(separateSquaresI(root.left), separateSquaresI(root.right));
}