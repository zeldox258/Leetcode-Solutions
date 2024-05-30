function smallestAbsentPositiveGreaterT(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(smallestAbsentPositiveGreaterT(root.left), smallestAbsentPositiveGreaterT(root.right));
}