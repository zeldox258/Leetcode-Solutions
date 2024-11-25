function minimumBitwiseOrFromGrid(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumBitwiseOrFromGrid(root.left), minimumBitwiseOrFromGrid(root.right));
}