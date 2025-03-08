function numberOfBeautifulPairs(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfBeautifulPairs(root.left), numberOfBeautifulPairs(root.right));
}