function maximumNumberOfFishInAGrid(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfFishInAGrid(root.left), maximumNumberOfFishInAGrid(root.right));
}