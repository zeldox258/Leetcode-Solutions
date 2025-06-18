function validWordAbbreviation(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(validWordAbbreviation(root.left), validWordAbbreviation(root.right));
}