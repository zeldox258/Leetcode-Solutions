function searchInRotatedSortedArray(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(searchInRotatedSortedArray(root.left), searchInRotatedSortedArray(root.right));
}