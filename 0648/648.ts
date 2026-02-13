function replaceWords(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(replaceWords(root.left), replaceWords(root.right));
}