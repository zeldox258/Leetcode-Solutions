function simpleBankSystem(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(simpleBankSystem(root.left), simpleBankSystem(root.right));
}