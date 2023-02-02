function theNumberOfWaysToMakeTheSum(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(theNumberOfWaysToMakeTheSum(root.left), theNumberOfWaysToMakeTheSum(root.right));
}