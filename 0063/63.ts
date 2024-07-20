function uniquePathsIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(uniquePathsIi(root.left), uniquePathsIi(root.right));
}