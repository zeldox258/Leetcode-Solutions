function removeSubfoldersFromTheFilesys(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(removeSubfoldersFromTheFilesys(root.left), removeSubfoldersFromTheFilesys(root.right));
}