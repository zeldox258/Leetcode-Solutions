function fairCandySwap(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(fairCandySwap(root.left), fairCandySwap(root.right));
}