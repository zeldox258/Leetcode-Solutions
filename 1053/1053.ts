function previousPermutationWithOneSwap(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(previousPermutationWithOneSwap(root.left), previousPermutationWithOneSwap(root.right));
}