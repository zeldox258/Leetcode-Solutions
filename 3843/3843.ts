function firstElementWithUniqueFrequenc(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(firstElementWithUniqueFrequenc(root.left), firstElementWithUniqueFrequenc(root.right));
}