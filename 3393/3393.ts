function countPathsWithTheGivenXorValue(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countPathsWithTheGivenXorValue(root.left), countPathsWithTheGivenXorValue(root.right));
}