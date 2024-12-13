function minimumTimeToCollectAllApplesI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(minimumTimeToCollectAllApplesI(root.left), minimumTimeToCollectAllApplesI(root.right));
}