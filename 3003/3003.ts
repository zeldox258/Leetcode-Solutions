function maximizeTheNumberOfPartitionsA(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximizeTheNumberOfPartitionsA(root.left), maximizeTheNumberOfPartitionsA(root.right));
}