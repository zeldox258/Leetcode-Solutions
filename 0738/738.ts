function monotoneIncreasingDigits(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(monotoneIncreasingDigits(root.left), monotoneIncreasingDigits(root.right));
}