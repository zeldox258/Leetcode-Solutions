function kthLargestSumInABinaryTree(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(kthLargestSumInABinaryTree(root.left), kthLargestSumInABinaryTree(root.right));
}