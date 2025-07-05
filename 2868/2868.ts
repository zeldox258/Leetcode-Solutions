function theWordingGame(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(theWordingGame(root.left), theWordingGame(root.right));
}