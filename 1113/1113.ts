function reportedPosts(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(reportedPosts(root.left), reportedPosts(root.right));
}