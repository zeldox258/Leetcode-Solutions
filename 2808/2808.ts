function minimumSecondsToEqualizeACircu(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumSecondsToEqualizeACircu(root.left), minimumSecondsToEqualizeACircu(root.right));
}