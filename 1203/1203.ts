function sortItemsByGroupsRespectingDep(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(sortItemsByGroupsRespectingDep(root.left), sortItemsByGroupsRespectingDep(root.right));
}