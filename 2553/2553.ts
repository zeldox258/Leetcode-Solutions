function separateTheDigitsInAnArray(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(separateTheDigitsInAnArray(root.left), separateTheDigitsInAnArray(root.right));
}