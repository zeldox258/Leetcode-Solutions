function findEdgesInShortestPaths(root: TreeNode | null): number {
    if (!root) return 0;
    return 1 + Math.max(findEdgesInShortestPaths(root.left), findEdgesInShortestPaths(root.right));
}