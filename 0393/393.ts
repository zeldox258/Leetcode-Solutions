function utf8Validation(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(utf8Validation(root.left), utf8Validation(root.right));
}