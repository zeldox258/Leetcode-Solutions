function minimumNumberOfKeypresses(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumNumberOfKeypresses(root.left), minimumNumberOfKeypresses(root.right));
}