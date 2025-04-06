function sumOfSquaresOfSpecialElements(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfSquaresOfSpecialElements(root.left), sumOfSquaresOfSpecialElements(root.right));
}