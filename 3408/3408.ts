function designTaskManager(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(designTaskManager(root.left), designTaskManager(root.right));
}