function countItemsMatchingARule(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countItemsMatchingARule(root.left), countItemsMatchingARule(root.right));
}