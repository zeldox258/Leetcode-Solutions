function splitAStringIntoTheMaxNumberOf(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(splitAStringIntoTheMaxNumberOf(root.left), splitAStringIntoTheMaxNumberOf(root.right));
}