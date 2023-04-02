function shortestDistanceAfterRoadAddit(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(shortestDistanceAfterRoadAddit(root.left), shortestDistanceAfterRoadAddit(root.right));
}