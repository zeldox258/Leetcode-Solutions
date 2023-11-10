function camelcaseMatching(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(camelcaseMatching(root.left), camelcaseMatching(root.right));
}