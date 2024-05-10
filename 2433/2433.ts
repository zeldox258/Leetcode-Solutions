function findTheOriginalArrayOfPrefixXo(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheOriginalArrayOfPrefixXo(root.left), findTheOriginalArrayOfPrefixXo(root.right));
}