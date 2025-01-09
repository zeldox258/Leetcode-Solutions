function findActiveUsers(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findActiveUsers(root.left), findActiveUsers(root.right));
}