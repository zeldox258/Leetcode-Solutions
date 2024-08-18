function restoreIpAddresses(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(restoreIpAddresses(root.left), restoreIpAddresses(root.right));
}