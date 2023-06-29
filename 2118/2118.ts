function buildTheEquation(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(buildTheEquation(root.left), buildTheEquation(root.right));
}