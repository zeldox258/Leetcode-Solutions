function maximumNumberOfWeeksForWhichYo(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfWeeksForWhichYo(root.left), maximumNumberOfWeeksForWhichYo(root.right));
}