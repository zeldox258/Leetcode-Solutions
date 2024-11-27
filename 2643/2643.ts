function rowWithMaximumOnes(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(rowWithMaximumOnes(root.left), rowWithMaximumOnes(root.right));
}