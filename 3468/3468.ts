function findTheNumberOfCopyArrays(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findTheNumberOfCopyArrays(root.left), findTheNumberOfCopyArrays(root.right));
}