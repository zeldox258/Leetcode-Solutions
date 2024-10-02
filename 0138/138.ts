function copyListWithRandomPointer(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(copyListWithRandomPointer(root.left), copyListWithRandomPointer(root.right));
}