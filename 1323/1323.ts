function maximum69Number(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(maximum69Number(root.left), maximum69Number(root.right));
}