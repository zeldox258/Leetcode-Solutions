function sumOfAllSubsetXorTotals(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sumOfAllSubsetXorTotals(root.left), sumOfAllSubsetXorTotals(root.right));
}