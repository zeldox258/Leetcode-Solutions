function minimumMovesToMoveABoxToTheirT(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumMovesToMoveABoxToTheirT(root.left), minimumMovesToMoveABoxToTheirT(root.right));
}