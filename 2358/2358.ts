function maximumNumberOfGroupsEnteringA(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfGroupsEnteringA(root.left), maximumNumberOfGroupsEnteringA(root.right));
}