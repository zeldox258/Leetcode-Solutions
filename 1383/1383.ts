function maximumPerformanceOfATeam(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumPerformanceOfATeam(root.left), maximumPerformanceOfATeam(root.right));
}