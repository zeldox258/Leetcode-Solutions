/**
 * @param {TreeNode} root
 * @return {number}
 */
var findEdgesInShortestPaths = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findEdgesInShortestPaths(root.left), findEdgesInShortestPaths(root.right));
};