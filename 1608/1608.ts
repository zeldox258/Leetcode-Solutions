function specialArrayWithXElementsGreat(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(specialArrayWithXElementsGreat(root.left), specialArrayWithXElementsGreat(root.right));
}