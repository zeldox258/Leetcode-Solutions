function crackingTheSafe(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(crackingTheSafe(root.left), crackingTheSafe(root.right));
}