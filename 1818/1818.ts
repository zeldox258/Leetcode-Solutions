function minimumAbsoluteSumDifference(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumAbsoluteSumDifference(root.left), minimumAbsoluteSumDifference(root.right));
}