function binarySearchTreeToGreaterSumTr(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(binarySearchTreeToGreaterSumTr(root.left), binarySearchTreeToGreaterSumTr(root.right));
}