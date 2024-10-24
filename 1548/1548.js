/**
 * @param {TreeNode} root
 * @return {number}
 */
var theMostSimilarPathInAGraph = function(root) {
    if (!root) return 0;
    return 1 + Math.max(theMostSimilarPathInAGraph(root.left), theMostSimilarPathInAGraph(root.right));
};