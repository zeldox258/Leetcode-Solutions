function highestSalariesDifference(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(highestSalariesDifference(root.left), highestSalariesDifference(root.right));
}