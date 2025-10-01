function findBottomLeftTreeValue(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findBottomLeftTreeValue(root.left), findBottomLeftTreeValue(root.right));
}