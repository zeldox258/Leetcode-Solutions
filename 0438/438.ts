function findAllAnagramsInAString(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findAllAnagramsInAString(root.left), findAllAnagramsInAString(root.right));
}