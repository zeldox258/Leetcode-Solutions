function addDigits(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(addDigits(root.left), addDigits(root.right));
}