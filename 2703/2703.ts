function returnLengthOfArgumentsPassed(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(returnLengthOfArgumentsPassed(root.left), returnLengthOfArgumentsPassed(root.right));
}