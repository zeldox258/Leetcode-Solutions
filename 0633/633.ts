function sumOfSquareNumbers(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfSquareNumbers(root.left), sumOfSquareNumbers(root.right));
}