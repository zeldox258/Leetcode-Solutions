function cousinsInBinaryTree(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(cousinsInBinaryTree(root.left), cousinsInBinaryTree(root.right));
}