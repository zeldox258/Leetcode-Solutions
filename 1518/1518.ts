function waterBottles(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(waterBottles(root.left), waterBottles(root.right));
}