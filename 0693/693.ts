function binaryNumberWithAlternatingBit(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(binaryNumberWithAlternatingBit(root.left), binaryNumberWithAlternatingBit(root.right));
}