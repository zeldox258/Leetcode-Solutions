function shortestWordDistance(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(shortestWordDistance(root.left), shortestWordDistance(root.right));
}