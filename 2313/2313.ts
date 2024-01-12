function minimumFlipsInBinaryTreeToGetR(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumFlipsInBinaryTreeToGetR(root.left), minimumFlipsInBinaryTreeToGetR(root.right));
}