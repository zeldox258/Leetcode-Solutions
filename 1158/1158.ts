function marketAnalysisI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(marketAnalysisI(root.left), marketAnalysisI(root.right));
}