function arrayWithElementsNotEqualToAve(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(arrayWithElementsNotEqualToAve(root.left), arrayWithElementsNotEqualToAve(root.right));
}