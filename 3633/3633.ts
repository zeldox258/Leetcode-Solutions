function earliestFinishTimeForLandAndWa(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(earliestFinishTimeForLandAndWa(root.left), earliestFinishTimeForLandAndWa(root.right));
}