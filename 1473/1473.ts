function paintHouseIii(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(paintHouseIii(root.left), paintHouseIii(root.right));
}