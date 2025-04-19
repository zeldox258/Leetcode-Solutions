function designTictactoe(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(designTictactoe(root.left), designTictactoe(root.right));
}