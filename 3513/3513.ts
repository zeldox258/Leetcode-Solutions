function numberOfUniqueXorTripletsI(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(numberOfUniqueXorTripletsI(root.left), numberOfUniqueXorTripletsI(root.right));
}