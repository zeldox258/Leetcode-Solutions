function findNumberOfCoinsToPlaceInTree(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findNumberOfCoinsToPlaceInTree(root.left), findNumberOfCoinsToPlaceInTree(root.right));
}