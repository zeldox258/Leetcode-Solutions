function minimumDeletionsToMakeStringBa(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumDeletionsToMakeStringBa(root.left), minimumDeletionsToMakeStringBa(root.right));
}