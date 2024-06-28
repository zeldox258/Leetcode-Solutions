function longestFibonacciSubarray(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(longestFibonacciSubarray(root.left), longestFibonacciSubarray(root.right));
}