function maximizeSumOfSquaresOfDigits(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximizeSumOfSquaresOfDigits(root.left), maximizeSumOfSquaresOfDigits(root.right));
}