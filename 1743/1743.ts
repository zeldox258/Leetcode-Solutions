function restoreTheArrayFromAdjacentPai(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(restoreTheArrayFromAdjacentPai(root.left), restoreTheArrayFromAdjacentPai(root.right));
}