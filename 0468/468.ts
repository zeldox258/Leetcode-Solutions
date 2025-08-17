function validateIpAddress(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(validateIpAddress(root.left), validateIpAddress(root.right));
}