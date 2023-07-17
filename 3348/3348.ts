function smallestDivisibleDigitProductI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(smallestDivisibleDigitProductI(root.left), smallestDivisibleDigitProductI(root.right));
}