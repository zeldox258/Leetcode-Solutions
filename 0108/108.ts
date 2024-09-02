function convertSortedArrayToBinarySear(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(convertSortedArrayToBinarySear(root.left), convertSortedArrayToBinarySear(root.right));
}