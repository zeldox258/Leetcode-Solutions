function designBoundedBlockingQueue(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(designBoundedBlockingQueue(root.left), designBoundedBlockingQueue(root.right));
}