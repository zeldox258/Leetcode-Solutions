function minimumValueToGetPositiveStepB(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumValueToGetPositiveStepB(root.left), minimumValueToGetPositiveStepB(root.right));
}