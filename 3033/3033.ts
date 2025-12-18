function modifyTheMatrix(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(modifyTheMatrix(root.left), modifyTheMatrix(root.right));
}