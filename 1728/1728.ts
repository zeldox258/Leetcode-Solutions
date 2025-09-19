function catAndMouseIi(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(catAndMouseIi(root.left), catAndMouseIi(root.right));
}