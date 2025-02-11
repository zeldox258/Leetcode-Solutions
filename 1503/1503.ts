function lastMomentBeforeAllAntsFallOut(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(lastMomentBeforeAllAntsFallOut(root.left), lastMomentBeforeAllAntsFallOut(root.right));
}