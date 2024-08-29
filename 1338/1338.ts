function reduceArraySizeToTheHalf(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(reduceArraySizeToTheHalf(root.left), reduceArraySizeToTheHalf(root.right));
}