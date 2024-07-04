function rotateImage(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(rotateImage(root.left), rotateImage(root.right));
}