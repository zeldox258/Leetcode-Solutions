function changeNullValuesInATableToTheP(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(changeNullValuesInATableToTheP(root.left), changeNullValuesInATableToTheP(root.right));
}