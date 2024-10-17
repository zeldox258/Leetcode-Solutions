function findMinimumInRotatedSortedArra(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findMinimumInRotatedSortedArra(root.left), findMinimumInRotatedSortedArra(root.right));
}