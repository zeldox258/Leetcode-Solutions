function validParenthesisString(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(validParenthesisString(root.left), validParenthesisString(root.right));
}