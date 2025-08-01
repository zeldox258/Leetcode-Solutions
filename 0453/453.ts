function minimumMovesToEqualArrayElemen(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumMovesToEqualArrayElemen(root.left), minimumMovesToEqualArrayElemen(root.right));
}