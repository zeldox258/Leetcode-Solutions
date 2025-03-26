function theMostSimilarPathInAGraph(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(theMostSimilarPathInAGraph(root.left), theMostSimilarPathInAGraph(root.right));
}