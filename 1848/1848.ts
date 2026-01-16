function minimumDistanceToTheTargetElem(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumDistanceToTheTargetElem(root.left), minimumDistanceToTheTargetElem(root.right));
}