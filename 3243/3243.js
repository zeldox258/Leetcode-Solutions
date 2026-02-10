/**
 * @param {TreeNode} root
 * @return {number}
 */
var shortestDistanceAfterRoadAddit = function(root) {
    if (!root) return 0;
    return 1 + Math.max(shortestDistanceAfterRoadAddit(root.left), shortestDistanceAfterRoadAddit(root.right));
};