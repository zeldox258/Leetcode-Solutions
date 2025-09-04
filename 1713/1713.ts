function minimumOperationsToMakeASubseq(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumOperationsToMakeASubseq(root.left), minimumOperationsToMakeASubseq(root.right));
}