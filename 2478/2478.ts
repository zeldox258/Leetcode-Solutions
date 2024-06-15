function numberOfBeautifulPartitions(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfBeautifulPartitions(root.left), numberOfBeautifulPartitions(root.right));
}