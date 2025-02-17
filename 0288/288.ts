function uniqueWordAbbreviation(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(uniqueWordAbbreviation(root.left), uniqueWordAbbreviation(root.right));
}