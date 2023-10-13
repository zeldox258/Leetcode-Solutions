function findValidPairOfAdjacentDigitsI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findValidPairOfAdjacentDigitsI(root.left), findValidPairOfAdjacentDigitsI(root.right));
}