function largestLocalValuesInAMatrix(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(largestLocalValuesInAMatrix(root.left), largestLocalValuesInAMatrix(root.right));
}