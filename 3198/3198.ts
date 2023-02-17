function findCitiesInEachState(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findCitiesInEachState(root.left), findCitiesInEachState(root.right));
}