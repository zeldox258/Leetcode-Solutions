function countConnectedComponentsInLcmG(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(countConnectedComponentsInLcmG(root.left), countConnectedComponentsInLcmG(root.right));
}