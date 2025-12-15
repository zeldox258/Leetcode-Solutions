function designInmemoryFileSystem(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(designInmemoryFileSystem(root.left), designInmemoryFileSystem(root.right));
}