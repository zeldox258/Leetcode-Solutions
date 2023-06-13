function lengthOfLongestFibonacciSubseq(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(lengthOfLongestFibonacciSubseq(root.left), lengthOfLongestFibonacciSubseq(root.right));
}